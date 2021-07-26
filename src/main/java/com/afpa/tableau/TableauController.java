package com.afpa.tableau;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableauController {


    public TextField prenomfield;
    public TextField nomfield;
    public TextField villefield;
    public Button sauver;
    public Button annuler;
    public Button supprimer;
    public TableView tableview;
    public TableColumn colnom;
    public TableColumn colprenom;

    ObservableList<Client> model = FXCollections.observableArrayList();

    public void addClient(ActionEvent actiuonEvent) {
        Client cli = new Client(nomfield.getText(), prenomfield.getText(), villefield.getText());
        model.add(cli);
    }

//    @Override
//    public void initialize(){

}





//}
