package com.afpa;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    public void fanAddition(ActionEvent actionEvent) throws IOException {
        Stage stage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("additionneur/addition.fxml"));
        Scene scene = new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }

    public void fanExo2(ActionEvent actionEvent) throws IOException {
        Stage stage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("exo2/exo2.fxml"));
        Scene scene = new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }

    public void fanExo3(ActionEvent actionEvent) throws IOException {
        Stage stage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("exo3/exo3.fxml"));
        Scene scene = new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }

    public void fantab(ActionEvent actionEvent) throws IOException {
        Stage stage1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("tableau/tableau.fxml"));
        Scene scene = new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }
}
