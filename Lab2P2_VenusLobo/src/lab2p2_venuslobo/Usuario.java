/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;

public class Usuario {

    //ATRIBUTOS 
    public String nombreUsuario;
    public String contrasena;
    public String tipoUsuario;

    //CONSTRUCTOR
    public Usuario(String nombreUsu, String contra, String tipoUsu) {
        this.nombreUsuario = nombreUsu;
        this.contrasena = contra;
        this.tipoUsuario = tipoUsu;
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
            throw new Exception("La contraseña debe tener al menos 8 caracteres.");
        }
    }

    public String getContrasena() throws Exception {
        if (contrasena == null || contrasena.length() < 8) {
            throw new Exception("La contraseña no cumple con los requisitos minimos.");
        }
        return contrasena;
    }

    public void setTipoUsuario(String tipoUsu) {
        this.tipoUsuario = tipoUsu;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
