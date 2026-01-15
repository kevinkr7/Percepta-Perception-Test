package com.percepta.controller;

import com.percepta.model.*;
import com.percepta.service.QuestionBank;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.List;
import java.util.Map;
import java.util.EnumMap;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuestionController {

    @FXML private Label questionLabel;
    @FXML private Button opt1, opt2, opt3, opt4, opt5;

    private List<Question> questions;
    private Map<PerceptionType, Integer> scores = new EnumMap<>(PerceptionType.class);
    private int currentIndex = 0;

    @FXML
    public void initialize() {
        questions = QuestionBank.getQuestions();

        for (PerceptionType type : PerceptionType.values()) {
            scores.put(type, 0);
        }

        loadQuestion();
    }

    private void loadQuestion() {
        Question q = questions.get(currentIndex);
        questionLabel.setText(q.getText());

        opt1.setText(q.getOptions().get(0).getText());
        opt2.setText(q.getOptions().get(1).getText());
        opt3.setText(q.getOptions().get(2).getText());
        opt4.setText(q.getOptions().get(3).getText());
        opt5.setText(q.getOptions().get(4).getText());
    }

    @FXML
    private void handleOption(ActionEvent event) {

        Button clicked = (Button) event.getSource();
        Question current = questions.get(currentIndex);

        int selectedIndex = switch (clicked.getId()) {
            case "opt1" -> 0;
            case "opt2" -> 1;
            case "opt3" -> 2;
            case "opt4" -> 3;
            case "opt5" -> 4;
            default -> -1;
        };

        PerceptionType type = current.getOptions()
                .get(selectedIndex)
                .getType();

        scores.put(type, scores.get(type) + 1);

        currentIndex++;

        if (currentIndex < questions.size()) {
            loadQuestion();
        } else {
            showResult();
        }
    }

    private void showResult() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/fxml/result.fxml")
            );

            Parent root = loader.load(); // MUST load first

            ResultController controller = loader.getController();
            controller.setScores(scores); // MUST be after load()

            Scene scene = new Scene(root, 900, 600);
            scene.getStylesheets().add(
                    getClass().getResource("/css/styles.css").toExternalForm()
            );

            Stage stage = (Stage) questionLabel.getScene().getWindow();
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
