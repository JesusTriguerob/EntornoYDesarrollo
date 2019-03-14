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
public class Alumno {
    
    private String nombre, apellidos, direccion, telefono, curso;
    
   private Asignatura as1,as2,as3,as4,as5;
   
   
    //constructor por defecto de la clase alumno
    public Alumno(String nombre, String apellidos, String direccion, String telefono, String curso){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.curso=curso; 
    }
   
    public Alumno(String nombre, String apellidos, String direccion, String telefono, String curso, Asignatura as1, Asignatura as2, Asignatura as3, Asignatura as4, Asignatura as5){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.curso=curso; 
        this.as1=as1;
        this.as2=as2;
        this.as3=as3;
        this.as4=as4;
        this.as5=as5;
        
    }

    public Asignatura getAs1() {
        return as1;
    }

    public void setAs1(Asignatura as1) {
        this.as1 = as1;
    }

    public Asignatura getAs2() {
        return as2;
    }

    public void setAs2(Asignatura as2) {
        this.as2 = as2;
    }

    public Asignatura getAs3() {
        return as3;
    }

    public void setAs3(Asignatura as3) {
        this.as3 = as3;
    }

    public Asignatura getAs4() {
        return as4;
    }

    public void setAs4(Asignatura as4) {
        this.as4 = as4;
    }

    public Asignatura getAs5() {
        return as5;
    }

    public void setAs5(Asignatura as5) {
        this.as5 = as5;
    }
    //metodos getters and setters
    //nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //apellidos
    public String getApellidos(){
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    //direccion
    public String getDireccion(){
        return this.direccion;
    }
    //telefono
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    boolean getNombre(String apellidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}