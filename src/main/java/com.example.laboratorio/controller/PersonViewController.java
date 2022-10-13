package com.example.laboratorio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonViewController implements Initializable {

    @FXML
    private TableColumn<?, ?> SemEs;

    @FXML
    private TextField añosAdmin;

    @FXML
    private TextField añosProfesor;

    @FXML
    private TableColumn<?, ?> careerEs;

    @FXML
    private TableColumn<?, ?> careerMo;

    @FXML
    private ChoiceBox<?> cargoAdmin;

    @FXML
    private ChoiceBox<?> carreraEstudiante;

    @FXML
    private ChoiceBox<?> carreraMonitor;

    @FXML
    private ChoiceBox<?> carreraProfesor;

    @FXML
    private TextField codigoMonitor;

    @FXML
    private TextField idAdmin;

    @FXML
    private TableColumn<?, ?> idEs;

    @FXML
    private TextField idEstudiante;

    @FXML
    private TableColumn<?, ?> idMo;

    @FXML
    private TextField idProfesor;

    @FXML
    private ChoiceBox<?> materiaProfesor;

    @FXML
    private TableColumn<?, ?> nameEs;

    @FXML
    private TableColumn<?, ?> nameMo;

    @FXML
    private TextField nombreAdmin;

    @FXML
    private TextField nombreEstudiante;

    @FXML
    private TextField nombreMonitor;

    @FXML
    private TextField nombreProfesor;

    @FXML
    private TableColumn<?, ?> semMo;

    @FXML
    private ChoiceBox<?> semestreEstudiante;

    @FXML
    private ChoiceBox<?> semestreMonitor;

    @FXML
    private TableView<?> tableMonitor;

    @FXML
    private TableView<?> tablePersonEs;

    @FXML
    void botonBuscarE(ActionEvent event) {

    }

    @FXML
    void botonCrearE(ActionEvent event) {

    }

    @FXML
    void botonEditarE(ActionEvent event) {

    }

    @FXML
    void botonEliminarE(ActionEvent event) {

    }

    @FXML
    void buscarAdmin(ActionEvent event) {

    }

    @FXML
    void buscarMonitor(ActionEvent event) {

    }

    @FXML
    void buscarProfesor(ActionEvent event) {

    }

    @FXML
    void crearAdmin(ActionEvent event) {

    }

    @FXML
    void crearMonitor(ActionEvent event) {

    }

    @FXML
    void crearProfesor(ActionEvent event) {

    }

    @FXML
    void editarAdmin(ActionEvent event) {

    }

    @FXML
    void editarMonitor(ActionEvent event) {

    }

    @FXML
    void editarProfesor(ActionEvent event) {

    }

    @FXML
    void eliminarAdmin(ActionEvent event) {

    }

    @FXML
    void eliminarMonitor(ActionEvent event) {

    }

    @FXML
    void eliminarProfesor(ActionEvent event) {

    }

    @FXML
    void idProfesor(ActionEvent event) {

    }

    @FXML
    void semestreMonitor(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /*@Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameEs.setCellValueFactory(new PropertyValueFactory<>("id"));
        careerEs.setCellValueFactory(new PropertyValueFactory<>("carrera"));
        semestreEstudiante.setCellValueFactory(new PropertyValueFactory<>("precio"));
        idEs.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    }*/
}

