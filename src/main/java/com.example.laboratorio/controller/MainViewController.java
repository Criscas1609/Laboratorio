package com.example.laboratorio.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import com.example.laboratorio.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainViewController {
    private LoginViewController loginController;
    private Stage stage;
    private Parent root;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void elementView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("ElementView.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void loanView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("LoanView.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void personView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("personsView.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void reportView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("ReportView.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void init( Stage stage, LoginViewController loginViewController) {
    this.loginController = loginViewController;
    this.stage = stage;
    }
}
