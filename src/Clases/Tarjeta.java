package Clases;

public class Tarjeta {
    public String nombre;
    public String FechaExpiracion;
    public double saldo;
    public int cvv;
    public Tarjeta(String nombre, String fechaExpiracion, double saldo,int cvv) {
        this.nombre = nombre;
        this.cvv = cvv;
        this.saldo=saldo;
        this.FechaExpiracion = fechaExpiracion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public String getFechaExpiracion() {
        return FechaExpiracion;
    }
    public void setFechaExpiracion(String fechaExpiracion) {
        FechaExpiracion = fechaExpiracion;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        saldo = saldo;
    }


}
