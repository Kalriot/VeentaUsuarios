package Logica;

import Clases.Persona;

import java.util.ArrayList;

public class RegistroUsuario {
    private ArrayList<Persona> usuarioRegistrado;
    public RegistroUsuario() {
        usuarioRegistrado = new ArrayList<>();
    }
    public void registrarUusario(Persona persona) {
        if (buscarPorDNI(persona.getDNI()) != null) {
            System.out.println("El usuario con DNI " + persona.getDNI() + " ya está registrado.");
        } else {
            usuarioRegistrado.add(persona);
            System.out.println("Usuario registrado: " + persona.getNombre());
        }
    }
    public Persona buscarPorDNI(int DNI) {
        for (Persona usuario : usuarioRegistrado) {
            if (usuario.getDNI() == DNI) {
                return usuario;
            }
        }
        return null;
    }

    public void mostrarUsuariosRegistrados() {
        if (usuarioRegistrado.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (Persona usuario : usuarioRegistrado) {
                System.out.println(usuario.toString());
            }
        }
    }
}
