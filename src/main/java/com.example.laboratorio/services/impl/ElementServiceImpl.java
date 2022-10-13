package com.example.laboratorio.services.impl;

import com.example.laboratorio.model.Element;
import com.example.laboratorio.services.ElementService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.ArrayList;

public class ElementServiceImpl implements ElementService{
    private List<Element> listElement  = new ArrayList<>();

    public ElementServiceImpl() {
        this.listElement = listElement;
    }

    public List<Element> getListElement() {
        return listElement;
    }

    public void setListElement(List<Element> listElement) {
        this.listElement = listElement;
    }

    ObservableList<Element> elementObservableList= FXCollections.observableArrayList();
    ObservableList<String>tipoElemenList= FXCollections.observableArrayList("Fichas","Piezas_Metal","Esferas","Ruedas");

    @Override
    public void crearElemen(String nombre, String tipo, String cantidad, String uso, String ubicacion, String estado, String id, int precio) {
        elementObservableList.add(new Element(nombre, tipo, cantidad, uso, ubicacion, estado, id, precio));
        Element element = new Element(nombre, tipo, cantidad, uso, ubicacion, estado, id, precio);
        listElement.add(element);
    }

    @Override
    public ObservableList<Element> getObservableListElement() {
        return elementObservableList;
    }
    public ObservableList<String> getTipoElemenList(){
        return tipoElemenList;
    }
}
