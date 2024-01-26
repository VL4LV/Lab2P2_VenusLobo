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
    public void setNombre(String name)  {
        
    }

    public String getNombre() {
        return nombreUsuario;
    }

    public void setContrasena(String nuevaContrasena)  {
        if (nuevaContrasena.length() >= 8) {
            this.contrasena = nuevaContrasena;
        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }
    }

    public String getContrasena() throws Exception {
        return contrasena;
    }

    public void setTipoUsuario(String tipoUsu) {
        this.tipoUsuario = tipoUsu;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
