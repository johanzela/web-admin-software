/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author JOHAN ZELA
 */
public class chofer {
    private String cod_chofer;
    private String nombre;
    private Date fecha;
    private String categoria;

    public chofer() {
    }

    public chofer(String cod_chofer, String nombre, Date fecha, String categoria) {
        this.cod_chofer = cod_chofer;
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCod_chofer() {
        return cod_chofer;
    }

    public void setCod_chofer(String cod_chofer) {
        this.cod_chofer = cod_chofer;
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
