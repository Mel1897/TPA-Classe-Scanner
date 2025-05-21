/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classtabuada1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ClassTabuada1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();  // Lê o número digitado

        // Exibe a tabuada do número
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o scanner
        scanner.close();
    }
}
