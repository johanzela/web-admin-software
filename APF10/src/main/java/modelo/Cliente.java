package modelo;
public class Cliente {
private int nro;
private String cliente;
private double costo;
private int año ; 
private int tipo;

    public Cliente() {
        this.cliente = cliente;
    }
    public Cliente(int nro, String cliente, double costo, int año, int tipo) {
        this.nro = nro;
        this.cliente = cliente;
        this.costo = costo;
        this.año = año;
        this.tipo = tipo;
    }
 
public double monto(){
    switch (tipo) {
        case 1:
            costo=8500;
            break;
        case 2:
            costo=12000;
            break;
        default:
            costo=15000;
            break;
    }
return costo;
} 
 public double interes(){
 double inte=0;
 
 if(año<6) inte=0.15*costo*año;
 else if(año<10) inte=0.02*costo*año;
 else inte=0.03*costo*año; 
 return inte; 
 }
 public double saldo(){
 return interes()+costo;
 }
 public double cuota(){
 return saldo()/año;
 }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
 /*
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return costo;
    }

    public void setMonto(double costo) {
        this.costo = costo;
    }

    public int getMes() {
        return año;
    }

    public void setMes(int año) {
        this.año = año;
    }

}
*/