/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariobruto;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Salariobruto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salariobruto, porcentajedeimpuesto, deduccionadicional, impuesto, salarioneto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa tu salario bruto: ");
        salariobruto = teclado.nextDouble();
        
        System.out.println("Ingresa tu porcentaje de impuesto: ");
        porcentajedeimpuesto = teclado.nextDouble();
        
        System.out.println("Ingresa tus deducciones adicionales: ");
        deduccionadicional = teclado.nextDouble();
        
        impuesto = salariobruto * (porcentajedeimpuesto / 100);
        salarioneto = salariobruto - impuesto - deduccionadicional;
        
        System.out.println("El impuesto de tu salario es: " + impuesto);
        System.out.println("El salario neto es: " + salarioneto);
    }
    
}
