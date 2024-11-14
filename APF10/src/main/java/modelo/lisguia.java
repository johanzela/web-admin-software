package modelo;

import java.sql.Date;

public class lisguia {

    private String id_guia;
    private String nombre;
    private Date fecha;
    private String origen;
    private int cantidad;

    public lisguia() {
    }

    public lisguia(String id_guia, String nombre, Date fecha, String origen) {
        this.id_guia = id_guia;
        this.nombre = nombre;
        this.fecha = fecha;
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getId_guia() {
        return id_guia;
    }

    public void setId_guia(String id_guia) {
        this.id_guia = id_guia;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
