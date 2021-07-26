package com.afpa.exo3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import org.w3c.dom.ls.LSOutput;


public class Exo3Controller {

    public Slider slide_r;
    public Label labval_r;
    public Label labval_b;
    public Label labval_v;
    public Label labcol_r;
    public Slider slide_b;
    public Label labcol_b;
    public Slider slide_v;
    public Label labcol_v;
    public double r, v, b;
    public Pane grandLabel;

    @FXML
    public void initialize() {
        slide_r.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println("rouge vaut : " + slide_r.getValue());
                r = slide_r.getValue();
                labcol_r.setStyle("-fx-background-color: rgb("+r+","+0+","+0+")");
                labval_r.setText(String.valueOf(r));

                fond();


            }
        });

        slide_b.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println("bleux vaut : " + slide_b.getValue());
                b = slide_b.getValue();
                labcol_b.setStyle("-fx-background-color: rgb("+0+","+0+","+b+")");
                labval_b.setText(String.valueOf(b));
                fond();
            }
        });

        slide_v.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                System.out.println("vert vaut : " + slide_v.getValue());
                v = slide_v.getValue();
                labcol_v.setStyle("-fx-background-color: rgb("+0+","+v+","+0+")");
                labval_v.setText(String.valueOf(v));
                fond();
            }
        });

    }


    public void fond() {
        grandLabel.setStyle("-fx-background-color: rgb("+r+","+b+","+v+")");
    }
}