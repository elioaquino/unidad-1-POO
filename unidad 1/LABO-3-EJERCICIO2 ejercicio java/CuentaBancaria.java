package LABO_3_EJERCICIO2;

import javax.swing.plaf.PanelUI;

public class CuentaBancaria {

    // ATRIBUTOS DEL OBJETO
    private int numero_de_cuenta;
    private double saldo ;
    private String titular;


    // METODO CONSTRUCTOR
    public CuentaBancaria(int numero_de_cuenta, double saldo, String titular) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if ( saldo > 0 ){
            this.saldo = saldo;
        }
        else {
            System.out.printf("El saldo debe ser positivo");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // METODO PARA DEPOSITAR
    public void depositar(double cantidad){

        if (cantidad > 0) {   // ASEGURAMOS QUE LA CANTIDAD SEA POSITIVO
            this.saldo += cantidad;
        }
        else{
            System.out.printf("la cantidad debe ser maypr a 0!!");
        }
    }

    // METODO PARA PODER RETIRARA DINERO DE LA CUENTA
    public void retirar(double cantidad){
        if ( cantidad > 0 && cantidad < saldo){
            this.saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "numerode cuenta : " + numero_de_cuenta + ", saldo : " + saldo + ", titular : " + titular;
    }
}
