/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;
public class Conferencia {
    private String tituloConferencia;  
    private String conferencia; 
    private String fecha; 
    private String duracion; 
    private String enlace; 

    public Conferencia(String tituloConferencia, String conferencia, String fecha, String duracion, String enlace) {
        this.tituloConferencia = tituloConferencia;
        this.conferencia = conferencia;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlace = enlace;
    }

    public String getTituloConferencia() {
        return tituloConferencia;
    }

    public void setTituloConferencia(String tituloConferencia) {
        this.tituloConferencia = tituloConferencia;
    }

    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Conferencia{" + "tituloConferencia=" + tituloConferencia + ", conferencia=" + conferencia + ", fecha=" + fecha + ", duracion=" + duracion + ", enlace=" + enlace + '}';
    }
    
    
    
}
