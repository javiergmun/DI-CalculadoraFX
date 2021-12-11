package com.example.practicasdisint;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Vista vista = new Vista();
        //5 botones de 50 px x 5 botones de 50px
        Scene scene = new Scene(vista, 250, 250);
        stage.setTitle("Calculadora de Javier");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}