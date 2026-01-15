package com.percepta.controller;

import com.percepta.model.PerceptionType;
import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.ActionEvent;

import java.io.InputStream;
import java.util.Map;

public class ResultController {

    @FXML private ImageView resultIcon;
    @FXML private Label dominantLabel;
    @FXML private Label explanationLabel;

    // Bars and Labels
    @FXML private ProgressBar visualBar, auditoryBar, kinestheticBar, analyticalBar, intuitiveBar;
    @FXML private Label visualPct, auditoryPct, kinestheticPct, analyticalPct, intuitivePct;
    @FXML private VBox visualBox, auditoryBox, kinestheticBox, analyticalBox, intuitiveBox;

    // Containers
    @FXML private VBox root; // The card container

    @FXML
    public void initialize() {
        root.setOpacity(0);
        root.setScaleX(0.95);
        root.setScaleY(0.95);
    }

    public void setScores(Map<PerceptionType, Integer> scores) {
        int total = scores.values().stream().mapToInt(i -> i).sum();

        // 1. Animate Bars
        animateBar(visualBox, visualBar, visualPct, scores.get(PerceptionType.VISUAL), total);
        animateBar(auditoryBox, auditoryBar, auditoryPct, scores.get(PerceptionType.AUDITORY), total);
        animateBar(kinestheticBox, kinestheticBar, kinestheticPct, scores.get(PerceptionType.KINESTHETIC), total);
        animateBar(analyticalBox, analyticalBar, analyticalPct, scores.get(PerceptionType.ANALYTICAL), total);
        animateBar(intuitiveBox, intuitiveBar, intuitivePct, scores.get(PerceptionType.INTUITIVE), total);

        // 2. Determine Winner
        PerceptionType dominant = scores.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        // 3. Set Text
        dominantLabel.setText(getDisplayName(dominant));
        explanationLabel.setText(getExplanation(dominant));

        // 4. Set Image
        String imagePath = switch (dominant) {
            case VISUAL -> "/images/visual.png";
            case AUDITORY -> "/images/auditory.png";
            case KINESTHETIC -> "/images/kinesthetic.png";
            case ANALYTICAL -> "/images/analytical.png";
            case INTUITIVE -> "/images/intuitive.png";
        };

        try {
            InputStream is = getClass().getResourceAsStream(imagePath);
            if (is != null) {
                resultIcon.setImage(new Image(is));
                // START THE FLOATING ANIMATION ONCE IMAGE IS LOADED
                startFloatingAnimation();
            }
        } catch (Exception e) {
            System.err.println("Error loading image: " + imagePath);
        }

        playEntranceAnimations();
    }

    private void startFloatingAnimation() {
        // Moves the image up and down gently
        TranslateTransition levitate = new TranslateTransition(Duration.seconds(3), resultIcon);
        levitate.setByY(-15); // Move up 15 pixels
        levitate.setCycleCount(Animation.INDEFINITE); // Forever
        levitate.setAutoReverse(true); // Go back down
        levitate.setInterpolator(Interpolator.EASE_BOTH); // Smooth start/stop
        levitate.play();
    }

    private void animateBar(VBox box, ProgressBar bar, Label pct, int value, int total) {
        bar.setProgress(0);
        double progress = (total == 0) ? 0 : (double) value / total;
        int percent = (int) Math.round(progress * 100);
        pct.setText(percent + "%");

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1.5),
                        new KeyValue(bar.progressProperty(), progress, Interpolator.EASE_OUT))
        );
        timeline.play();
    }

    private String getExplanation(PerceptionType type) {
        return switch (type) {
            case VISUAL -> "You understand information best through images, diagrams, and visual patterns.";
            case AUDITORY -> "You learn most effectively by listening, discussions, and verbal explanations.";
            case KINESTHETIC -> "You prefer hands-on experiences and learning by doing rather than observing.";
            case ANALYTICAL -> "You rely on logic, structure, and step-by-step reasoning to understand concepts.";
            case INTUITIVE -> "You trust instincts, patterns, and abstract connections more than rigid structure.";
        };
    }

    private String getDisplayName(PerceptionType type) {
        return switch (type) {
            case VISUAL -> "The Seer";
            case AUDITORY -> "The Listener";
            case KINESTHETIC -> "The Mover";
            case ANALYTICAL -> "The Thinker";
            case INTUITIVE -> "The Intuitive";
        };
    }

    private void playEntranceAnimations() {
        FadeTransition ft = new FadeTransition(Duration.seconds(0.8), root);
        ft.setFromValue(0);
        ft.setToValue(1);

        ScaleTransition st = new ScaleTransition(Duration.seconds(0.8), root);
        st.setToX(1);
        st.setToY(1);
        st.setInterpolator(Interpolator.EASE_OUT);

        ParallelTransition pt = new ParallelTransition(ft, st);
        pt.play();
    }

    @FXML
    private void onRetake(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
            Scene scene = new Scene(loader.load(), 900, 600);
            scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}