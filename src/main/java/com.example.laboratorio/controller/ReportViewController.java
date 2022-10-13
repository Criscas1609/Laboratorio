package com.example.laboratorio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ReportViewController implements Initializable {

    @FXML
    private TableColumn<?, ?> cantiEl;

    @FXML
    private TableColumn<?, ?> careerEs;

    @FXML
    private TextField codigoReporte;

    @FXML
    private TableColumn<?, ?> idEl;

    @FXML
    private TableColumn<?, ?> idEs;

    @FXML
    private TableColumn<?, ?> localEl;

    @FXML
    private TableColumn<?, ?> nameEl;

    @FXML
    private TableColumn<?, ?> nameEs;

    @FXML
    private TextField nombreBuscarE;

    @FXML
    private TableColumn<?, ?> priceEl;

    @FXML
    private TableColumn<?, ?> semEs;

    @FXML
    private TableColumn<?, ?> stateEl;

    @FXML
    private TableView<?> tableReportEst;

    @FXML
    private TableColumn<?, ?> typeEl;

    @FXML
    private TableColumn<?, ?> useEl;

    @FXML
    void buscarCodigoR(ActionEvent event) {

    }

    @FXML
    void buscarNombre(ActionEvent event) {

    }

    @FXML
    void buscarPrestamoE(ActionEvent event) {

    }

    @FXML
    void cantidadPrestamo(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

