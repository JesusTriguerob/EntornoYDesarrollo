/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalumno;
import java.util.Scanner;
/**
 *
 * @author jesus
 */
public class ProcesaAlum {

    public static void entradaDatos(Alumno grupo[]){
        Scanner s = new Scanner(System.in);
        String nombre,apellidos,direccion,telefono,curso;
        
        for (int  i = 0; i < grupo.length; i++) {
            System.out.println("Introduce el nombre del " + (i+1) + " alumno");
            nombre =s.next();
           
            System.out.println("Introduce los apellidos del " + (i+1) + " alumno");
            apellidos = s.next();
            
            System.out.println("Introduce la direccion del " + (i+1) + " alumno");
            direccion = s.next();
            
            System.out.println("Introduce el telefono del " + (i+1) + " alumno");
            telefono = s.next();
            
            System.out.println("Introduce el curso del " + (i+1) + " alumno");
            curso = s.next();
            
            
            Asignatura as1 = new Asignatura("Entorno", "1 DAW");
            Asignatura as2 = new Asignatura("Programación", "1 DAW");
            Asignatura as3 = new Asignatura("Lenguaje de marcas", "1 DAW");
            Asignatura as4 = new Asignatura("Bases de Datos", "1 DAW");
            Asignatura as5 = new Asignatura("Sistemas", "1 DAW");
        
            grupo[i] = new Alumno(nombre,apellidos,direccion,telefono,curso,as1,as2,as3,as4,as5);
            nombre = grupo[i].getNombre();
            apellidos = grupo[i].getApellidos();
            direccion = grupo[i].getDireccion();
            telefono = grupo[i].getTelefono();
            curso = grupo[i].getCurso();
           
             System.out.println("Introduce la nota de entorno");
             int intnotaas1 = s.nextInt();
             grupo[i].getAs1().setNota(intnotaas1);
             System.out.println("Introduce la nota de programacion");
             int intnotaas2 = s.nextInt();
             grupo[i].getAs2().setNota(intnotaas2);
             System.out.println("Introduce la nota de lenguaje de marcas");
             int intnotaas3 = s.nextInt();
             grupo[i].getAs3().setNota(intnotaas3);
             System.out.println("Introduce la nota de Base de datos");
             int intnotaas4 = s.nextInt();
             grupo[i].getAs4().setNota(intnotaas4);
             System.out.println("Introduce la nota de sistemas");
             int intnotaas5 = s.nextInt();
             grupo[i].getAs5().setNota(intnotaas5);
        }     
    }
    
    public static void salidaDatos(Alumno grupo[]){
        System.out.println("Datos de los alumnos introducidos");
        System.out.println("---------");
        for (int i = 0; i < grupo.length; i++) {
        
        System.out.println("Nombre y Apellidos: " + grupo[i].getNombre() + " " + grupo[i].getApellidos());
        System.out.println("Direccion: " + grupo[i].getDireccion());
        System.out.println("Telefono: " + grupo[i].getTelefono());
        System.out.println("Curso: " + grupo[i].getCurso());
        System.out.println("Nota de Entorno y desarrollo: " + grupo[i].getAs1().getNota());
        System.out.println("Nota de Programacion: " + grupo[i].getAs2().getNota());
        System.out.println("Nota de Lenguaje de marcas: " + grupo[i].getAs3().getNota());
        System.out.println("Nota de Base de datos: " + grupo[i].getAs4().getNota());
        System.out.println("Nota de Sistemas informatico: " + grupo[i].getAs5().getNota());  
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // E N T R A D A   D E L  T A M A Ñ O   D E L   A R R A Y   
        System.out.println("¡Cuantos alumnos forman el grupo?");
        int numalu = s.nextInt();
        Alumno[] grupo = new Alumno[numalu];
        //E N T R A D A   DE  D A T O S 
        entradaDatos(grupo);
        System.out.println("");
        //M U E S T R A   P O R   P A N T A L L A
        salidaDatos(grupo);
       
    }
    
}
