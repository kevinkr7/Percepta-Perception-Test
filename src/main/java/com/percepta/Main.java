package com.percepta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/main.fxml")
        );

        // 900x600 fits our new layout perfectly
        Scene scene = new Scene(loader.load(), 900, 600);

        scene.getStylesheets().add(
                getClass().getResource("/css/styles.css").toExternalForm()
        );

        stage.setTitle("Percepta");

        /* ICON FIX:
           1. Ensure you have 'logo.png' in src/main/resources/images/
           2. JavaFX works best with PNGs, not ICOs.
        */
        try {
            // Updated path to use a PNG in the images folder
            InputStream iconStream = getClass().getResourceAsStream("/images/hero_image.png");
            if (iconStream != null) {
                stage.getIcons().add(new Image(iconStream));
            } else {
                System.out.println("⚠️ Warning: Could not find /images/hero_image.png");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.setScene(scene);
        stage.setResizable(false); // Keeps the layout strict
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}