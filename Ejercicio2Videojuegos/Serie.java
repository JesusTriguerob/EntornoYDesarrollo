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
public class Serie {
    
    private String titulo, genero, creador;
    private int numTemp = 3;
    private boolean prestado = false;
    
    public Serie(String titulo, String genero, String creador){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumTemp() {
        return numTemp;
    }

    public void setNumTemp(int numTemp) {
        this.numTemp = numTemp;
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
