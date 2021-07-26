package com.afpa.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Form1Controller {
    public Button btn2;
    @FXML
    private TextField textfield1;

    @FXML
    private Button btn1;

    @FXML
    private Label label1;


    public void btn1_click(ActionEvent actionEvent) {
        label1.setText(textfield1.getText());

    }


    public void btn2_click(ActionEvent actionEvent) {
        label1.setText("Koi t'en veux encore?? tu veux ptet voir le cul à " + textfield1.getText());
    }

    public void carre() {

    }

    public TextField getTextfield1() {
        return textfield1;
    }




}