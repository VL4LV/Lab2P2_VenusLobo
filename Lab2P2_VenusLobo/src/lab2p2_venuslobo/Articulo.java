/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;
public class Articulo {

    public String tituloArti;
    public String autorArti;
    public String fechaPubli;
    public String tema; 
    public String acceso;

    public Articulo(String tituloArti, String autorArti,String tema, String fechaPubli, String acceso) {
        this.tituloArti = tituloArti;
        this.autorArti = autorArti;
        this.fechaPubli = fechaPubli;
        this.acceso = acceso;
        this.tema = tema; 
    }

    public String getTituloArti() {
        return tituloArti;
    }

    public void setTituloArti(String tituloArti) {
        this.tituloArti = tituloArti;
    }

    public String getAutorArti() {
        return autorArti;
    }

    public void setAutorArti(String autorArti) {
        this.autorArti = autorArti;
    }

    public String getFechaPubli() {
        return fechaPubli;
    }

    public void setFechaPubli(String fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Articulo{" + "tituloArti=" + tituloArti + ", autorArti=" + autorArti + ", fechaPubli=" + fechaPubli + ", tema=" + tema + ", acceso=" + acceso + '}';
    }
    
    

}
