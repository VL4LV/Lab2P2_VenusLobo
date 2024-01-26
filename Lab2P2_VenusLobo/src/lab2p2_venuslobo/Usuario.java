/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Usuario {

    //ATRIBUTOS 
    public String nombreUsuario;
    public String contrasena;

    //CONSTRUCTOR
    public Usuario(String nombreUsu, String contra) {
        this.nombreUsuario = nombreUsu;
        this.contrasena = contra;
    }

    //MUTADORES 
    public void setNombre(String name) throws Exception {
        if (name.length() >= 4) {
            for (int i = 0; i < name.length(); i++) {
                char caracActual = name.charAt(i);

                // Validar que solo tenga letras el nombre 
                if (!(((int) caracActual >= 65 && (int) caracActual <= 90) || ((int) caracActual >= 97 && (int) caracActual <= 122))) {
                    throw new Exception("El nombre solo puede contener letras.");
                }
            }
            this.nombreUsuario = name;

        } else {
            throw new Exception("El nombre debe tener al menos 4 letras.");
        }
    }

    public String getNombre() {
        return nombreUsuario;
    }

    public void setContrasena(String nuevaContrasena) throws Exception {
        if (nuevaContrasena.length() >= 8) {
            this.contrasena = nuevaContrasena;
        } else {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
    }

    public String getContrasena() {
        if (contrasena == null || contrasena.length() < 8) {
            throw new IllegalStateException("La contraseña no cumple con los requisitos mínimos.");
        }
        return contrasena;
    }

}
