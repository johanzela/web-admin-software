
package modelo;

import java.sql.Date;

public class guias {
    private String cod_guia;
    private int horas;
    private Date fecha;
    private double cosguia;

    public guias() {
    }

    public guias(String cod_guia, int horas, Date fecha, double cosguia) {
        this.cod_guia = cod_guia;
        this.horas = horas;
        this.fecha = fecha;
        this.cosguia = cosguia;
    }

    public double getCosguia() {
        return cosguia;
    }

    public void setCosguia(double cosguia) {
        this.cosguia = cosguia;
    }

    public String getCod_guia() {
        return cod_guia;
    }

    public void setCod_guia(String cod_guia) {
        this.cod_guia = cod_guia;
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
