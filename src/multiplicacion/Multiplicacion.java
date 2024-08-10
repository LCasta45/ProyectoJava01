/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;

/**
 *
 * @author lesli
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();
            
            double multiplicacion = numero1 * numero2;
            
            System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        }
    }
    
}
