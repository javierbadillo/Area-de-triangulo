/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosunidad3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Ejerciciosunidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingresa la medida de la base del triangulo: ");
        base = teclado.nextInt();
        System.out.println("Ingresa la medida de la altura del triangulo: ");
        altura = teclado.nextInt();

        area = base*altura/2;

        System.out.println("El area del triangulo es: " + area);
        
    }
    
}
