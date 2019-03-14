/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCO1;

/**
 *
 * @author Jesus Triguero
 */
public class Persona {
    
    //variables
private String nombre;
private String apellidos;
private int edad = 0;
private double peso = 0;
private double altura = 0;
private String sexo = null;   
    
    //constructor por defecto
    public Persona(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;   
    }

    public Persona(String nombre, String apellidos, int edad, double peso, double altura, String sexo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        this.sexo=sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double calcularIMC(double p, double e){
       double c;
       p = getPeso();
       e = getAltura();
       c = p/(e*e);
         
        if (c < 20) {
            System.out.println("-1");   
        } else if (c >= 20 && c <= 25) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        return c;
    }
    
    public boolean esMayorDeEdad(){
        if(getEdad()>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public String comprobarSexo(String H, String M){
       H= "hombre";
       M ="mujer";
       if (getSexo()!= H){
           if(getSexo()!= M){
               getSexo().replace(getSexo(), "H");
           }
       }
       return getSexo();
       
    }
}



