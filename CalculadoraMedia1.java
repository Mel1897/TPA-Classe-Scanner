/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedia1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraMedia1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0.0;
        int quantidadeNotas = 4;
        
        // Solicitar as 4 notas ao usuário
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            
            // Verificando se a nota está dentro de um intervalo válido (0 a 10)
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
                i--; // Repetir a entrada da nota
                continue;
            }
            
            soma += nota; // Acumulando a soma das notas
        }
        
        // Calculando a média
        double media = soma / quantidadeNotas;
        
        // Exibindo o resultado da média
        System.out.printf("A média das 4 notas é: %.2f\n", media);
        
        // Fechar o scanner
        scanner.close();
    }
}
