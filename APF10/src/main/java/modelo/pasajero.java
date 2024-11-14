/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class pasajero {
private int cod_boleto;
private String nombre;
private int asiento;
private double pago;

    public pasajero() {
    }

    public pasajero(int cod_boleto, String nombre, int asiento, double pago) {
        this.cod_boleto = cod_boleto;
        this.nombre = nombre;
        this.asiento = asiento;
        this.pago = pago;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getCod_boleto() {
        return cod_boleto;
    }

    public void setCod_boleto(int cod_boleto) {
        this.cod_boleto = cod_boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }



}
