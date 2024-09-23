package Logica;

import Clases.Persona;
import Clases.Tarjeta;
import Clases.Zona;

public class RegistroVenta {
    private int idRegistroVenta;
    private int cantEntradas;
    private double totalPrecio;
    Tarjeta tarjeta;
    Persona persona;
    Zona zona;
    public RegistroVenta(int cantEntradas, Tarjeta tarjeta, Persona persona, Zona zona)
    {
        this.cantEntradas = cantEntradas;

        this.tarjeta=tarjeta;
        this.persona = persona;
        this.zona = zona;
        this.totalPrecio = calcularTotalPrecio();
    }
    public boolean registarVenta(){
        if (cantEntradas < 1 || cantEntradas > 4) {
            System.out.println("El máximo de entradas permitido es 4.");
            return false;
        }
        if (tarjeta.saldo< zona.getPrecio()){
            System.out.println("Saldo insuficiente en la tarjeta.");
            return false;
        }
        else{
            tarjeta.saldo -= calcularTotalPrecio();
            System.out.println("Venta registrada con éxito.");
            return true;
        }
    }
    public double calcularTotalPrecio(){
        if (cantEntradas >= 1 && cantEntradas <= 4) {
            return zona.getPrecio() * cantEntradas;
        } else {
            return 0.0;
        }

    }

}
