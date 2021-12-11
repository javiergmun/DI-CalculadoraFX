package com.example.practicasdisint;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    //ATRIBUTOS
    private Label pantalla;
    double op1;
    double op;
    double resultado;
    char tipoOp;
    //INVOCO LA CLASE MODELO PARA TRABAJAR CON ELLA Y SU SWITCH
    Modelo modelo= new Modelo();

    public Controller(Label pantalla){
        this.pantalla=pantalla;
    }

    public void manejarBotonNumerico(ActionEvent e) {
        pantalla.setText(pantalla.getText()+((Button) e.getSource()).getText());
        System.out.println("BOTON NUMERICO PULSADO");
    }

    public void manejarBotonOperacion(ActionEvent e) {
        modelo.setOp1(Double.parseDouble(pantalla.getText()));
        modelo.setTipoOp(((Button) e.getSource()).getText());
        pantalla.setText("");
        System.out.println("BOTON DE OPERACION PULSADO");
    }

    public void manejarBotonResultado(ActionEvent e) {
        modelo.setOp2(Double.parseDouble(pantalla.getText()));
        pantalla.setText(""+modelo.getResultado());
        System.out.println("BOTON DE RESULTADDO PULSADO");
    }

    public void limpiar(ActionEvent e) {
        pantalla.setText("");
        System.out.println("SE HA LIMPIADO EL RESULTADO");
    }

}