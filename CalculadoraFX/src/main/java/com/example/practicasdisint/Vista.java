package com.example.practicasdisint;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Vista extends Parent {
    Controller contr;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    Button mas,menos,multiplicar,dividir,reset,botonPunto,igual;
    GridPane grid;
    Label pantalla;
    VBox box;
    
    public Vista(){
        initComponentes();
    }

    private void initComponentes() {
        //COMPONENTES BOTONES
        n1 = new Button("1");
        n2 = new Button("2");
        n3 = new Button("3");
        n4 = new Button("4");
        n5 = new Button("5");
        n6 = new Button("6");
        n7 = new Button("7");
        n8 = new Button("8");
        n9 = new Button("9");
        n0 = new Button("0");
        mas = new Button("+");
        menos = new Button("-");
        dividir = new Button("/");
        multiplicar = new Button("x");
        igual = new Button("=");
        botonPunto = new Button(".");
        reset = new Button("RST");
        //COMPONENTES DE APPLICAION
        grid = new GridPane();
        pantalla = new Label();
        contr= new Controller(pantalla);
        box = new VBox(pantalla);
        //INCLUIR GRIDPANE EN BOX //ALINEAR ARRIBA DERECHA
        box.getChildren().add(grid);
        box.setAlignment(Pos.TOP_RIGHT);
        //AÑADIR AL GRIDPANE EL RESTO DE BOTONES
        grid.getChildren().addAll(n1, n2, n3, n4, n5, n6, n7, n8, n9, n0,
                botonPunto, reset, mas, menos, dividir, multiplicar, igual);
        //DEFINIR POSICIONES EN EL GRID DE CADA BOTON Y OPERADOR
        GridPane.setConstraints(n1, 0, 0, 1, 1);
        GridPane.setConstraints(n2, 1, 0, 1, 1);
        GridPane.setConstraints(n3, 2, 0, 1, 1);
        GridPane.setConstraints(n4, 0, 1, 1, 1);
        GridPane.setConstraints(n5, 1, 1, 1, 1);
        GridPane.setConstraints(n6, 2, 1, 1, 1);
        GridPane.setConstraints(n7, 0, 2, 1, 1);
        GridPane.setConstraints(n8, 1, 2, 1, 1);
        GridPane.setConstraints(n9, 2, 2, 1, 1);
        GridPane.setConstraints(n0, 0, 3, 1, 1);
        GridPane.setConstraints(botonPunto, 1, 3, 1, 1);
        GridPane.setConstraints(reset, 2, 3, 1, 1);
        GridPane.setConstraints(mas, 4, 0, 1, 1);
        GridPane.setConstraints(menos, 3, 0, 1, 1);
        GridPane.setConstraints(dividir, 3, 1, 1, 1);
        GridPane.setConstraints(multiplicar, 4, 1, 1, 1);
        GridPane.setConstraints(igual, 3, 2, 2, 2);
        //LO AÑADIMOS A VBOX
        this.getChildren().add(box);
        //UNA VEZ ASIGNADO EL SITIO, LE DAMOS EL TAMAÑO
        pantalla.setPrefSize(50,50);
        n0.setPrefSize(50,50);
        n1.setPrefSize(50,50);
        n2.setPrefSize(50,50);
        n3.setPrefSize(50,50);
        n4.setPrefSize(50,50);
        n5.setPrefSize(50,50);
        n6.setPrefSize(50,50);
        n7.setPrefSize(50,50);
        n8.setPrefSize(50,50);
        n9.setPrefSize(50,50);
        n0.setPrefSize(50,50);
        mas.setPrefSize(50,50);
        menos.setPrefSize(50,50);
        multiplicar.setPrefSize(50,50);
        dividir.setPrefSize(50,50);
        reset.setPrefSize(50,50);
        botonPunto.setPrefSize(50,50);
        igual.setPrefSize(50,50);
        igual.setTranslateX(25);

        //LE ASIGNAMOS A CADA BOTON UNA FUNCIONALIDAD EN UN EVENTO CON LAMBDA
        //BASICOS NUMEROS
        n0.setOnAction(e->contr.manejarBotonNumerico(e));
        n1.setOnAction(e->contr.manejarBotonNumerico(e));
        n2.setOnAction(e->contr.manejarBotonNumerico(e));
        n3.setOnAction(e->contr.manejarBotonNumerico(e));
        n4.setOnAction(e->contr.manejarBotonNumerico(e));
        n5.setOnAction(e->contr.manejarBotonNumerico(e));
        n6.setOnAction(e->contr.manejarBotonNumerico(e));
        n7.setOnAction(e->contr.manejarBotonNumerico(e));
        n8.setOnAction(e->contr.manejarBotonNumerico(e));
        n9.setOnAction(e->contr.manejarBotonNumerico(e));
        //OPERADORES
        multiplicar.setOnAction(e->contr.manejarBotonOperacion(e));
        dividir.setOnAction(e->contr.manejarBotonOperacion(e));
        mas.setOnAction(e->contr.manejarBotonOperacion(e));
        menos.setOnAction(e->contr.manejarBotonOperacion(e));
        //BOTON IGUAL
        igual.setOnAction(e->contr.manejarBotonResultado(e));
        //LIMPIAR
        reset.setOnAction(e->contr.limpiar(e));

    }

}
