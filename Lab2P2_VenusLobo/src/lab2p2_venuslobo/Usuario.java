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
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
