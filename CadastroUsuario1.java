/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrousuario1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CadastroUsuario1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicitar e ler a data de nascimento
        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        // Solicitar e ler o curso
        System.out.print("Digite o seu curso: ");
        String curso = scanner.nextLine();

        // Solicitar e ler a série
        System.out.print("Digite a sua série: ");
        String serie = scanner.nextLine();

        // Solicitar e ler a altura
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Solicitar e ler o peso
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Exibir as informações do usuário
        System.out.println("\n--- Dados cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}
