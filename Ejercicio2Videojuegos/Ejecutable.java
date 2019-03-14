/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2Videojuegos;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Ejecutable {
 
    public static void (Serie series[]){
        Scanner sc = new Scanner(System.in);
        String titulo,numTemp,genero,creador;
        for(int i = 0; i<2; i++){
            System.out.println("Introduce el título");
            titulo=sc.nextLine();
            System.out.println("Introduce el nº de temporadas para ese título");
            numTemp = sc.nextLine();
            System.out.println("Introduce el género");
            genero = sc.nextLine();
            System.out.println("Introduce el creador");
            creador = sc.nextLine() ;
            series[i]= new Serie (titulo, genero, creador);
            series[i].setNumTemp(Integer.parseInt(numTemp));
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Serie[] series = new Serie[2];
        Videojuego[] juego = new Videojuego[2];
        
        Serie a = null;
        Videojuego b = null;
        
        String titulo, numTemp, genero, creador, compañia, nHoras; 
        String serie; String juego1;
        String juego2 = null, serie2 = null;
        
        int cSeries = 0, cJuego = 0;
        int as = 0, ab = 0;
        
        boolean alquiler = false;
 
        for(int i = 0; i<2; i++){
            System.out.println("Introduce el título");
            titulo=sc.nextLine();
            System.out.println("Introduce el nº de temporadas para ese título");
            numTemp = sc.nextLine();
            System.out.println("Introduce el género");
            genero = sc.nextLine();
            System.out.println("Introduce el creador");
            creador = sc.nextLine() ;
            series[i]= new Serie (titulo, genero, creador);
            series[i].setNumTemp(Integer.parseInt(numTemp));
        }
        System.out.println("--------------");
        for(int i = 0; i<2; i++){
            System.out.println("Introduce el título");
            titulo=sc.nextLine();
            System.out.println("Introduce el nº horas estimadas para ese título");
            nHoras = sc.nextLine();
            System.out.println("Introduce el género");
            genero = sc.nextLine();
            System.out.println("Introduce la compañia");
            compañia = sc.nextLine();
            juego[i]= new Videojuego(titulo, genero, compañia);
            juego[i].sethEstimadas(Integer.parseInt(nHoras));
        }
        System.out.println("------------");
        do{
            System.out.println("Quieres alquilar alguna serie o videojuego? (Si/No)");
            String respuesta = sc.nextLine();
            if(respuesta.equals("Si")){
                System.out.println("¿Qué serie desea alquilar?");
                 System.out.println("\t" + " 0 - No me gusta ninguna");
                for(int i = 0; i<2; i++){
                    if(series[i].isPrestado()==false){
                    System.out.println("\t" + (i+1) + " - " +  series[i].getTitulo());
                    }
                }
                serie = sc.nextLine();
                if(!serie.equals("0")){
                    series[Integer.parseInt(serie)-1].alquilar();
                    cSeries++;
                }
                
                System.out.println("");
                System.out.println("¿Qué juego quieres alquilar?");
                System.out.println("\t" + "0 - No me gusta ninguno");
                for(int i = 0; i<2; i++){
                    if(juego[i].isPrestado()==false){
                    System.out.println("\t" + (i+1) + " - " +  juego[i].getTitulo());
                     }
                }
                juego1 = sc.nextLine();
                if(!juego1.equals("0")){      
                    juego[Integer.parseInt(juego1)-1].alquilar();
                    cJuego++;
                }
                System.out.println("");
                System.out.println("Quieres alquilar otro artículo?");
                if(sc.nextLine().equals("No")){
                    alquiler=true;
                }
            }else{
                alquiler=true;
            }
        }while(alquiler==false);
        System.out.println("Se han alquilado " + cSeries + " series y " + cJuego + " videojuegos");
        System.out.println("");
        System.out.print("el videojuego con más horas es: ");
        for(int i = 0 ; i<2; i++){
            as = Integer.MIN_VALUE;
            if(juego[i].gethEstimadas()>as){
                as=juego[i].gethEstimadas();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            if(juego[i].gethEstimadas()==as){
                juego2=juego[i].getTitulo();
            }
        }
        
        System.out.println(juego2 + " con " + as + " horas.");
        
        System.out.print("la serie con más temporadas es: ");
        for(int i = 0 ; i<2; i++){
            ab = Integer.MIN_VALUE;
            if(series[i].getNumTemp()>ab){
                ab=series[i].getNumTemp();
                
            }
        }
        
        for (int i = 0; i < 2; i++) {
            if(series[i].getNumTemp()==ab){
                serie2=series[i].getTitulo();
            }
        }
        
        System.out.println(serie2 + " con " + as + " temporadas.");
    }
    
}
