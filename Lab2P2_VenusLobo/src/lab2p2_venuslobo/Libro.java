/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;

public class Libro {
    //ATRIBUTOS
    public String titulo; 
    public String autor; 
    public String genero; 
    public int anoPublicacion; 
    public String disponibilidad; 
    
    //CONSTRUCTOR
    public Libro(String titulo, String autor, String genero, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero; 
        this.anoPublicacion = anio; 
        this.disponibilidad = "disponible";
    }
    
    //MUTADORES
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
