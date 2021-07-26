package com.afpa.additionneur;

//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdditionController {


    public Button b1;


    public Button b4;
    public Button b3;
    public Button b2;
    public Button b5;
    public Button b6;
    public Button b9;
    public Button b8;
    public Button b7;
    public Button vider;
    public Button calcul;
    public Button b0;

    @FXML
    private TextArea textfield1;
    @FXML
    private Label label1;
    @FXML
    private Button btn1;

    public int res;

    public void vider_click(ActionEvent actionEvent) {
        textfield1.clear();

    }

    public void calcul_click(ActionEvent actionEvent) {
        textfield1.setText("="+res);

    }


    public void affichage(Event event) {

        String str = ((Button) event.getSource()).getText();
        System.out.println(str);
        System.out.println("le res est de "+res);

        switch (str) {

            case "1" -> {
                res += 1;
                textaff("1");
            }
            case "2" -> {
                res += 2;
                textaff("2");
            }
            case "3" -> {
                res += 3;
                textaff("3");
            }
            case "4" -> {
                res += 4;
                textaff("4");
            }
            case "5" -> {
                res += 5;
                textaff("5");
            }
            case "6" -> {
                res += 6;
                textaff("6");
            }
            case "7" -> {
                res += 7;
                textaff("7");
            }
            case "8" -> {
                res += 8;
                textaff("8");
            }
            case "9" -> {
                res += +9;
                textaff("9");
            }
            case "0" -> {
                res += 0;
                textaff("0");
            }
        }
    }

    public void textaff(String str1){
String str2 = textfield1.getText()+str1;
        textfield1.setText(str2+"+\n");
    }
}




