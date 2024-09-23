import Clases.Persona;
import Clases.Tarjeta;
import Clases.Zona;
import Logica.RegistroUsuario;
import Logica.RegistroVenta;

public class Main {
    public static void main(String[] args) {
        RegistroUsuario reg = new RegistroUsuario();
        Persona Juan=new Persona(12233,"Juan","paquitosaurio@gmail.com","0000");
        Tarjeta tarjeta=new Tarjeta("Tarjeta Vip","22/06",450.0,235);
        Zona zona=new Zona("Zona Vip",120,24.0);
        
        reg.registrarUusario(Juan);

        RegistroVenta venta=new RegistroVenta(3,tarjeta,Juan,zona);
        boolean resultado=venta.registarVenta();
        if(resultado){
            System.out.println("Registro Venta exitoso");
        }
        else{
            System.out.println("Registro Venta no exitoso");
        }

    }
}