/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingresa tu peso en kilogramos; ");
        peso = teclado.nextDouble();
        System.out.println("Ingresa tu altura en metros: ");
        altura = teclado.nextDouble();
        
        imc = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal (IMC) es: " + imc);
        
    }
    
}
