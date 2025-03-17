/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculopromedio;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Calculopromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3, promedio;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingresa un numero entero: ");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa otra numero; ");
        numero2 = teclado.nextInt();
        System.out.println("Ingresa un nuevo numero; ");
        numero3 = teclado.nextInt();

        promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio es: " + promedio);
        
    }
    
}
