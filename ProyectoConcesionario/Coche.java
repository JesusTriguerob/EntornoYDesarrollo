/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 * @author jesus
 */

package ProyectoConcesionario;

public class Coche {
    
    static private int ruedas = 4;
    
    private String matricula;
    private String marca;
    private String modelo;
    private char combustible;
    private int cilindrada;
    private String color;

    //Constructor principal.
    public Coche(String matricula, String marca, String modelo, char combustible,int cilindrada, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.color = color;
        this.cilindrada = cilindrada;
    }
    //Constructor sobrecargado.
    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        combustible = 'D';  //valor por defecto.
        cilindrada = 1600;  //valor por defecto.
        color = "Blanco";   //valor por defecto.
    }
    
    //Metodos Gets -> Consultar

    public static int getRuedas() {
        return ruedas;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public char getCombustible() {
        return combustible;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public String getColor() {
        return color;
    }
    
    //Metodos Sets -> Editar
    //Creamos solo los que queremos que se puedan editar.

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
