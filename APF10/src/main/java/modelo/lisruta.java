/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JOHAN ZELA
 */
public class lisruta {
    private String id_ruta;
    private String ruta;
    private int cantidad;
    
    public lisruta(String id_ruta, String ruta) {
        this.id_ruta = id_ruta;
        this.ruta = ruta;
    }

    public lisruta() {
    }

    
    
    public String getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(String id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
