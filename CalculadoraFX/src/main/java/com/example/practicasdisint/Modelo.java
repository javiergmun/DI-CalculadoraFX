package com.example.practicasdisint;

public class Modelo {
    private double op1;
    private double op2;
    // private double resultado;
    private String tipoOp;

    //METODO QUE DEVUELVE UN DOUBLE CON SWITCH QUE ELIGE OPERACION
    public double calcular() {
        switch (tipoOp) {
            case "+":
                System.out.println("SUMA");
                return op1 + op2;
            case "-":
                System.out.println("RESTA");
                return op1 - op2;
            case "x":
                System.out.println("MULTIPLICACION");
                return op1 * op2;
            case "/":
                System.out.println("DIVISION");
                if (op2 == 0) {
                    System.out.println("INDETERMINACION 0/0");
                    return 0;
                }
                return (op1 / op2);
        }
        System.out.println("ESTA CALCULADORA NO ACEPTA TU OPERACION");
        return 0;
    }

    //GETTERS Y SETTERS
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getResultado() {
        return calcular();
    }

    public String getTipoOp() {
        return tipoOp;
    }

    public void setTipoOp(String tipoOp) {
        this.tipoOp = tipoOp;
    }


}

