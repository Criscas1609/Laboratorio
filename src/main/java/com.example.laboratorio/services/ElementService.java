package com.example.laboratorio.services;

import com.example.laboratorio.model.Element;
import javafx.collections.ObservableList;

public interface ElementService {
    void crearElemen(String nombre, String tipo,String cantidad,String uso, String ubicacion, String estado,String id,int precio);
    public ObservableList<Element> getObservableListElement();
    public ObservableList<String> getTipoElemenList();

}
