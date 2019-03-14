/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalumno;

/**
 *
 * @author jesus
 */
public class Asignatura {
    private String nombre, curso;
    private double nota;
    
    public Asignatura(String nombre, String curso, double nota){
        this.nombre=nombre;
        this.curso=curso;
        this.nota=nota;
    }
   
    public Asignatura(String nombre, String curso){
        this.nombre=nombre;
        this.curso=curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

   

    
    public double notaMedia(double nota1eva, double nota2eva, double nota3eva){
        double media = (nota1eva+nota2eva+nota3eva)/3;
        return media;
    }

 
    
}
