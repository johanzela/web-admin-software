/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

public class asesorVenta {
private String cod_asesor;
private String nombre;
private Date fecha;
private String area;

    public asesorVenta() {
    }

    public asesorVenta(String cod_asesor, String nombre, Date fecha, String area) {
        this.cod_asesor = cod_asesor;
        this.nombre = nombre;
        this.fecha = fecha;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCod_asesor() {
        return cod_asesor;
    }

    public void setCod_asesor(String cod_asesor) {
        this.cod_asesor = cod_asesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
