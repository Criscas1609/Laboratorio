package com.example.laboratorio.controller;

import com.example.laboratorio.model.Element;
import com.example.laboratorio.services.ModelFactoryControllerService;
import com.example.laboratorio.services.impl.LaboratoryServiceImpl;
import javafx.collections.ObservableList;

public class ModelFactoryController implements ModelFactoryControllerService {
    LaboratoryServiceImpl laboratory;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratory = new LaboratoryServiceImpl();
    }
    public Boolean login(String user, String password){
        System.out.println(user + password);
        return laboratory.getLoginService().login(user,password);
    }


    //Elementos funciones:

    public void crearElemen(String nombre, String tipo,String cantidad,String uso, String ubicacion, String estado,String id,int precio){
        laboratory.getElementService().crearElemen(nombre, tipo, cantidad, uso, ubicacion, estado, id, precio);
    }
    public ObservableList<Element>getElementArrayList(){
        return laboratory.getElementService().getObservableListElement();
    }
    public ObservableList<String>getTipoElement(){
        return laboratory.getElementService().getTipoElemenList();
    }


}

