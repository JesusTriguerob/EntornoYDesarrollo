 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocumentacionProblema;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class DocumentarProblema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("- - - F R U T E R I A  - - -");
        System.out.println("- - - L A  R E P E R A - - -");
       Scanner s = new Scanner(System.in);
       
       //Variables 
            double compraTotal = 0;
            int compra=0;
            int selFru = 0;
            int fresas, peras, manzanas, platanos, piñas;
     //- - - - - B A S E   D E   D A T O S  - - - - - //
     
                    //Array para almacenar nombres de frutas
                    String nombFrutas [] = new String[6];
                    nombFrutas[1] = "fresas";
                    nombFrutas[2] = "peras";
                    nombFrutas[3] = "manzanas";
                    nombFrutas[4] = "platanos";
                    nombFrutas[5] = "piñas";
                    //array para almacenar estocaje
                    int cantfrutas[]= new int[6];
                    cantfrutas[1] = 50;
                    cantfrutas[2] = 25;
                    cantfrutas[3] = 30;
                    cantfrutas[4] = 36;
                    cantfrutas[5] = 80;
                    //array para almacenar los precios
                    double precios[] = new double[6];
                    precios[1] = 1.56;
                    precios[2] = 2.10;
                    precios[3] = 0.90;
                    precios[4] = 1.22;
                    precios[5] = 2.45;
                    
        boolean contCompra = false; //buleano para continuar comprando
            while(contCompra == false){ // bucle para continuar comprando
                  
                    //Muestra por pantalla la base de datos y estocaje de frutas.
                     for (int i = 0; i < 1; i++) {
                         cantfrutas()
                     }
                        //Pregunta y comienzo del funcionamiento del programa
                     boolean compraverificada = false; 
                     
                             while(compraverificada == false){            
                                System.out.println("Introduce el numero del producto que deseas comprar? (1-5)");
                                     selFru = s.nextInt();
                                if (selFru <=0){  
                                     System.out.println("Por favor, introduzca un numero entre 1 y 5");      
                                     compraverificada = false;
                                }
                                else if(selFru >=6){
                                     System.out.println("Por favor, introduzca un numero entre 1 y 5");      
                                     compraverificada = false;
                                }
                                 else{
                                     compraverificada = true;
                                 }
                             }
                             //Pregunta los kilos a comprar
                             for (int i = 1; i < 2; i++) {
                                System.out.println("Cuantos kilos de " + nombFrutas[selFru] + " quieres comprar?");
                                 compra = s.nextInt();
                                   
                             }
                             //Resumen y pago
                                 System.out.println("has comprado: " + compra + " kilos de " + nombFrutas[selFru]);
                                 cantfrutas[selFru] = (cantfrutas[selFru] - compra) ;
                                 System.out.println("El kilo de " + nombFrutas[selFru] + " esta a " + precios[selFru] + "€ el kilo");
                                 System.out.println();
                                 System.out.println("Tienes que pagar: ");
                                 
                                 System.out.println((precios[selFru]*compra) + "€");
                                 compraTotal += (precios[selFru]*compra);
                                 System.out.println();
                                 System.out.println("Llevas gastado: " + compraTotal);
                             //Pregunta si quieres seguir comprando
                             System.out.println();
                             System.out.println("Quieres continuar comprando?");
                             System.out.println("1.Sí");
                             System.out.println("2.No");      
                             int respuesta = s.nextInt();
                                 if (respuesta == 1){
                                     contCompra = false;
                                 }
                                 else {
                                     contCompra = true;
                                 }
                             
        }
            //Resumen total
            System.out.println("Cuenta total a pagar: " + compraTotal + " Euros");
      
    }
    
}
