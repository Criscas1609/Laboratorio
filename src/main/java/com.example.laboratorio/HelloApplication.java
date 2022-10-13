package com.example.laboratorio;



import com.example.laboratorio.controller.ElementViewController;
import com.example.laboratorio.controller.LoginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage viewStage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation((getClass().getResource("ElementView.fxml")));
        Scene scene = new Scene(fxmlLoader.load());
        viewStage.setScene(scene);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        ElementViewController controller = fxmlLoader.getController();
        controller.setStage(viewStage);
        viewStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}