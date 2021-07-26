package com.afpa.exo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.sql.SQLOutput;
import java.util.Locale;

public class Exo2Controller {

    public CheckBox Casse;
    public CheckBox couleurText;
    @FXML
    public CheckBox couleurFond;
    public RadioButton maj;
    public RadioButton min;
    public RadioButton Tnoir;
    public RadioButton Tblanc;
    public RadioButton Trouge;
    public Label label1;
    public RadioButton frouge;
    public RadioButton fvert;
    public RadioButton fbleu;
    public TextField textfield1;
    public String css;
    public ToggleGroup gFond;
    public ToggleGroup gText;
    public TitledPane panfond;
    public TitledPane pantext;
    public TitledPane panecasse;
    public ToggleGroup gCasse;

    public void affLab(ActionEvent actionEvent) {
        label1.setText(textfield1.getText());
    }


//    public void majuscule(ActionEvent event) {
//        if (maj.isSelected()) {
//            label1.setText(textfield1.getText().toUpperCase());
//        } else {
//            label1.setText(textfield1.getText());
//        }
//    }
//
//    public void minuscule(ActionEvent event) {
//        if (min.isSelected()) {
//            label1.setText(textfield1.getText().toLowerCase());
//        } else {
//            label1.setText(textfield1.getText());
//        }
//    }

//    public void fondrouge(ActionEvent event) {
//        if (frouge.isSelected()) {
//            label1.setStyle("-fx-background-color: red;");
//        } else {
//            label1.setStyle("-fx-background-color: none;");
//        }
//    }
//
//    public void fondvert(ActionEvent event) {
//        if (fvert.isSelected()) {
//            label1.setStyle("-fx-background-color: green;");
//        } else {
//            label1.setStyle("-fx-background-color: none;");
//        }
//    }
//
//    public void fondbleu(ActionEvent event) {
//        if (fbleu.isSelected()) {
//            label1.setStyle("-fx-background-color: #8181f5;");
//        } else {
//            label1.setStyle("-fx-background-color: none;");
//        }
//    }

//    public void txtrouge(ActionEvent event) {
//        if (Trouge.isSelected()) {
//            label1.setStyle("-fx-text-fill: red;");
//        } else {
//            label1.setStyle("-fx-text-fill: none;");
//        }
//    }
//
//    public void txtblanc(ActionEvent event) {
//        if (Tblanc.isSelected()) {
//            label1.setStyle("-fx-text-fill: white;");
//        } else {
//            label1.setStyle("-fx-text-fill: none;");
//        }
//    }
//
//    public void txtnoir(ActionEvent event) {
//        if (Tnoir.isSelected()) {
//            label1.setStyle("-fxtext-fill: black;");
//        } else {
//            label1.setStyle("-fx-text-fill: none;");
//        }
//    }

    public void activefond() {
        if (couleurFond.isSelected()) {
            panfond.setDisable(false);
            if (gFond.getSelectedToggle() != null) {
                RadioButton gFondSelectedToggle = (RadioButton) gFond.getSelectedToggle();
                String colorfond = gFondSelectedToggle.getText();
                System.out.println(colorfond);
                switch (colorfond) {
                    case "Rouge" -> css = css + "-fx-background-color: red;";
                    case "Vert" -> css = css + "-fx-background-color: green;";
                    case "Bleu" -> css = css + "-fx-background-color: blue;";
                    default -> css = css + "-fx-background-color: white;";
                }
            }
        } else {
           css= "-fx-background-color: none";
            panfond.setDisable(true);
        }
        label1.setStyle(css);
    }


    public void activetext() {
        if (couleurText.isSelected()) {
            pantext.setDisable(false);
            if (gText.getSelectedToggle() != null) {
                RadioButton gTextSelectedToggle = (RadioButton) gText.getSelectedToggle();
                String colortext = gTextSelectedToggle.getText();
                System.out.println(colortext);
                switch (colortext) {
                    case "Rouge" -> css = css + "-fx-text-fill: red;";
                    case "Blanc" -> css = css + "-fx-text-fill: white;";
                    case "Pourpre" -> css = css + "-fx-text-fill: purple;";
                    default -> css = css + "-text-fill: black;";
                }
            }
            label1.setStyle(css);
        } else {
            pantext.setDisable(true);
        }
    }

public void maj() {
    if (Casse.isSelected()) {
        Alert.AlertType alertAlertType;
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText("T'as desactive la casse Mec!!");
        alert.showAndWait();
        panecasse.setDisable(false);
        if (gCasse.getSelectedToggle() != null){
            RadioButton gCassechoix = (RadioButton) gCasse.getSelectedToggle();
            String majtext = gCassechoix.getText();
            switch(majtext){
                case "Minuscule" -> label1.setText(textfield1.getText().toLowerCase());
                case "Majuscule" -> label1.setText((textfield1.getText().toUpperCase()));
                default -> label1.setText(textfield1.getText());
            }
        }
    } else {
        panecasse.setDisable(true);
    }
}

}