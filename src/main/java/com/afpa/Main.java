package com.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/form1.fxml")));
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("additionneur/addition.fxml")));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }




}
