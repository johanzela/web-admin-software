/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

public class viajesChofer {
    private String cod_ruta;
    private int horas;
    private Date fecha;
    private double cosvia;

    public viajesChofer() {
    }

    public viajesChofer(String cod_ruta, int horas, Date fecha, double cosvia) {
        this.cod_ruta = cod_ruta;
        this.horas = horas;
        this.fecha = fecha;
        this.cosvia = cosvia;
    }

    public double getCosvia() {
        return cosvia;
    }

    public void setCosvia(double cosvia) {
        this.cosvia = cosvia;
    }

    public String getCod_ruta() {
        return cod_ruta;
    }

    public void setCod_ruta(String cod_ruta) {
        this.cod_ruta = cod_ruta;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
