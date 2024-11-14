/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;


public class viajes {
    private String cod_viaje;
    private Date fecha;
    private String hora;
    private double costo;

    public viajes() {
    }

    public viajes(String cod_viaje, Date fecha, String hora, double costo) {
        this.cod_viaje = cod_viaje;
        this.fecha = fecha;
        this.hora = hora;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCod_viaje() {
        return cod_viaje;
    }

    public void setCod_viaje(String cod_viaje) {
        this.cod_viaje = cod_viaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
