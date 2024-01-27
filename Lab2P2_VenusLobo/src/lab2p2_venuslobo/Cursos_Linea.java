/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_venuslobo;
public class Cursos_Linea {
    public String tituloCursos; 
    public String instructor; 
    public String duracion; 
    public String plataforma; 

    public Cursos_Linea(String tituloCursos, String instructor, String duracion, String plataforma) {
        this.tituloCursos = tituloCursos;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataforma = plataforma;
    }

    public String getTituloCursos() {
        return tituloCursos;
    }

    public void setTituloCursos(String tituloCursos) {
        this.tituloCursos = tituloCursos;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos_Linea{" + "tituloCursos=" + tituloCursos + ", instructor=" + instructor + ", duracion=" + duracion + ", plataforma=" + plataforma + '}';
    }
    
    
    
    
    
}
