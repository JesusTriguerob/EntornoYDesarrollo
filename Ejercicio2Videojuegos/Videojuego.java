/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Videojuegos;

/**
 *
 * @author Jesus
 */
public class Videojuego {
    
    String titulo, genero, compañia;
    int hEstimadas = 10;
    boolean prestado = false;
    
    public Videojuego(String titulo, String genero, String compañia){
        this.titulo=titulo;
        this.genero=genero;
        this.compañia=compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int gethEstimadas() {
        return hEstimadas;
    }

    public void sethEstimadas(int hEstimadas) {
        this.hEstimadas = hEstimadas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public boolean alquilar(){
        return this.prestado=true;
    }
    
    public boolean devolver(){
        return this.prestado=false;
    }
    
    public boolean isEntregado(){
        if(this.prestado==true){
            return prestado;
        }else{
            return prestado;
        }
    }
}
