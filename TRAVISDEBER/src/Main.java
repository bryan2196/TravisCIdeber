import java.util.Scanner;

/**
 
 * @author Bryan Macias
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        Scanner reader = new Scanner(System.in);
        int valor1= 0;
        int valor2= 0;
        int resultado;
        System.out.println("Ingresa el primer valor");
        valor1= reader.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2= reader.nextInt();
        resultado =valor1+valor2;
       
        System.out.println("la suma es"+valor1+"+"+valor2+"="+resultado);

    }
    
}
