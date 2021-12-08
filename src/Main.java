
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Timana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String cadena = leer.nextLine();
        
        if(esPalindromo(cadena)){
            System.out.println("=================");
            System.out.println("Es palindromo");
            System.out.println("=================");
        }else{
            System.out.println("=================");
            System.out.println("No es Palindromo");
            System.out.println("=================");
        }
    }
    
    static boolean esPalindromo(String cadena){
        
        cadena = cadena.replace(" ", "");
        cadena = cadena.toLowerCase();
        
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for(int i = cadena.length()-1; i >= 0; i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        return cadena.equals(cadenaInvertida.toString());
    }
    
}
