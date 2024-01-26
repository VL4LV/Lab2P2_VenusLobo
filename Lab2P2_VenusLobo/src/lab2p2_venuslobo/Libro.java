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
}
