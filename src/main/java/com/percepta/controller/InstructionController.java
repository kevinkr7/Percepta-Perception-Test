package com.percepta.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class InstructionController {

    @FXML
    private void onBegin(ActionEvent event) throws Exception {
        Stage stage = (Stage) ((Node) event.getSource())
                .getScene().getWindow();

        Scene scene = new Scene(
                FXMLLoader.load(
                        getClass().getResource("/fxml/question.fxml")
                ),
                800, 500
        );

        scene.getStylesheets().add(
                getClass().getResource("/css/styles.css").toExternalForm()
        );

        stage.setScene(scene);
    }

}
