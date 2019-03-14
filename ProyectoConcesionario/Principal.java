/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcesionario;

/**
 *
 * @author jesus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    //instanciamos "coche"
        Coche c1 = new Coche("4585cwr","Audi","A5",'D',1900,"Gris");
        Coche c2 = new Coche("2314vfg","Mercedes","220");
        
        System.out.println("El número de ruedas de c1 y c2 es: " + Coche.getRuedas() + " Ruedas");
        System.out.println("");
        System.out.println("/////////////");
        System.out.println("Datos de c1: ");
        System.out.println("/////////////");
        System.out.println("Matricula: " + c1.getMatricula());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Combustible: " + c1.getCombustible());
        System.out.println("Cilindrada: " + c1.getCilindrada());
        System.out.println("Color: " + c1.getColor());
       
        System.out.println("");
        
        System.out.println("/////////////");
        System.out.println("Datos de c2: ");
        System.out.println("/////////////");
        System.out.println("Matricula: " + c2.getMatricula());
        System.out.println("Marca: " + c2.getMarca());
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Combustible: " + c2.getCombustible());
        System.out.println("Cilindrada: " + c2.getCilindrada());
        System.out.println("Color: " + c2.getColor());
        
    }
    
}
