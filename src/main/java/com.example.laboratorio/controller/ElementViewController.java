package com.example.laboratorio.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.laboratorio.controller.ModelFactoryController;
import com.example.laboratorio.model.Element;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;

import javafx.stage.Stage;


public class ElementViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    private Stage stage;
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        stage = stage;
    }

    /*
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;*/
    @FXML
    private TableColumn<?, ?> colEstadoEle;

    @FXML
    private TableColumn<?, ?> colIdElem;

    @FXML
    private TableColumn<?, ?> colNombreEle;

    @FXML
    private TableColumn<?, ?> colPrecioElem;

    @FXML
    private TableColumn<?, ?> colTipoEle;

    @FXML
    private TableColumn<?, ?> colUbiEle;

    @FXML
    private TableColumn<?, ?> colUsoEle;

    @FXML
    private TableColumn<?, ?> conlCantiEle;

    @FXML
    private ChoiceBox<?> cantidadElemen;
    @FXML
    private ChoiceBox<?> estadoElemen;
    @FXML
    private TextField idElemen;

    @FXML
    private TextField nombreElemen;

    @FXML
    private TextField precioElemen;

    @FXML
    private ChoiceBox tipoElemen;
    @FXML
    private ChoiceBox<?> ubiElemen;

    @FXML
    private ChoiceBox<?> usoElemen;
    /* private Alert alert;*/


    @FXML
    private TableView<Element> tblElement;

   /* private ObservableList<Element> elements;*/


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colIdElem.setCellValueFactory(new PropertyValueFactory<>("id"));
        colEstadoEle.setCellValueFactory(new PropertyValueFactory<>("estado"));
        colPrecioElem.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colNombreEle.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colTipoEle.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colUbiEle.setCellValueFactory(new PropertyValueFactory<>("ubicacion"));
        colUsoEle.setCellValueFactory(new PropertyValueFactory<>("uso"));

        tipoElemen.setValue("Fichas");
        tipoElemen.setItems(mfc.getTipoElement());
    }

    @FXML
    void crearElemen() {

       /* try {


            if (!this.elements.contains(element)) {
                this.elements.add(element);
                this.tblElement.setItems(elements);
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("El elemento existe");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }*/
        String nombre = String.valueOf(this.nombreElemen.getText());
        String tipo = String.valueOf(this.tipoElemen.getSelectionModel().selectedIndexProperty());
        String cantidad = String.valueOf(this.cantidadElemen.getSelectionModel().selectedIndexProperty());
        String uso = String.valueOf(this.usoElemen.getSelectionModel().selectedIndexProperty());
        String ubicacion = String.valueOf(this.ubiElemen.getSelectionModel().selectedIndexProperty());
        String estado = String.valueOf(this.estadoElemen.getSelectionModel().selectedIndexProperty());
        String id = String.valueOf(this.idElemen.getText());
        int precio = Integer.parseInt(this.precioElemen.getText());

        mfc.crearElemen(nombre,tipo,cantidad,uso,ubicacion,estado,id,precio);
        tblElement.setItems(mfc.laboratory.getElementService().getObservableListElement());
        tblElement.refresh();
    }

    @FXML
    void buscarElemen(ActionEvent event) {

    }
    @FXML
    void editarElemen(ActionEvent event) {

    }

    @FXML
    void eliminarElemen(ActionEvent event) {

    }

}

