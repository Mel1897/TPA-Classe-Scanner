/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ConversorTemperatura1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a unidade de origem:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
        int origem = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        switch (origem) {
            case 1:
                System.out.println("Fahrenheit: " + ((temp * 9/5) + 32));
                System.out.println("Kelvin: " + (temp + 273.15));
                break;
            case 2:
                System.out.println("Celsius: " + ((temp - 32) * 5/9));
                System.out.println("Kelvin: " + (((temp - 32) * 5/9) + 273.15));
                break;
            case 3:
                System.out.println("Celsius: " + (temp - 273.15));
                System.out.println("Fahrenheit: " + ((temp - 273.15) * 9/5 + 32));
                break;
            default:
                System.out.println("Unidade inválida.");
        }

        scanner.close();
    }
}
