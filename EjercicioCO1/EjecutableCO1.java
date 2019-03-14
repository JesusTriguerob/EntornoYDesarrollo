package EjercicioCO1;
import java.util.Scanner;
/**
 *
 * @author Jesus Triguero
 */
public class EjecutableCO1 {
    
    public static void entradaDeDatos(Persona personas[]){
      
        }
    
    public static void mayorDeEdad(Persona personas[]){
            System.out.println("¿Es Mayor de edad?");
        for (int i = 0; i < 3 ; i++) {
          System.out.println(personas[i].getNombre()+" :"+ personas[i].esMayorDeEdad());
        } 
    }
    public static void calculoIMC(Persona personas[]){
        int peso=0;
        double altura=0;
        System.out.println("Comprobaremos su IMC");
        System.out.println("Nivel bajo de grasa : -1");
        System.out.println("Nivel medio de grasa: 0");
        System.out.println("Nivel Alto de grasa: 1");
        System.out.println("........."); 
        for (int i = 0; i < 3 ; i++) {
            System.out.println(personas[i].getNombre()+ " :");
            System.out.println("IMC :" +personas[i].calcularIMC(peso,altura)); 
        }
    }
    public static void muestraInformacion(Persona personas[]){
        System.out.println("Informacion introducida");
        System.out.println("--------------");
         for (int i = 0; i < 3 ; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Apellidos: " + personas[i].getApellidos());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println("Peso: " + personas[i].getPeso());
            System.out.println("Altura: " + personas[i].getAltura());
            System.out.println("Sexo: " + personas[i].getAltura());
            System.out.println("----------------");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      // V A R I A B L E S
      String nombre, apellidos, sexo="H";
      int edad=0;
      double peso=0, altura=0;
     
      //C R E A C I Ó N   D E   A R R A Y 
      Persona[] personas = new Persona[3];
      
      // E N T R A D A   D E   D A T O S 
        for (int i = 0; i < 3 ; i++) {
             System.out.println("Introduce el nombre");
             nombre = s.next();
             System.out.println("Introduce los apellidos");
             apellidos = s.next();
             System.out.println("Introduce tu edad");
             edad = s.nextInt();
             System.out.println("Introduce tu peso");
             peso = s.nextDouble();
             System.out.println("Introduce tu altura");
             altura = s.nextDouble();
             System.out.println("Introduce tu sexo ('H' ó 'M')");
             sexo = s.next();
             s.nextLine();
             personas[i]= new Persona(nombre,apellidos,edad,peso,altura,sexo);
        }
        // I M C 
        System.out.println("---------");
        calculoIMC(personas);        
        //M A Y O R   D E   E D A D 
        System.out.println("---------");
        mayorDeEdad(personas);
        //M U E S T R A   D E   I N F O R M A C I Ó N 
        System.out.println("---------");
        muestraInformacion(personas);
        }
}
    

