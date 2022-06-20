package exercicioFixacao03;
    /*3. Criar um programa que calcule a média de salários de uma empresa
        pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.*/

import java.util.Scanner;

public class Exercicio03 {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a quantidade de funcionários: ");
                Integer quantidade = sc.nextInt();

                Double salario = 0.0;
                for (int i = 0; i < quantidade; i++) {
                        System.out.println("Digite o salário do " + (i + 1) + "º funcionário: ");
                        salario += sc.nextDouble();

                }
                System.out.println("Média salarial: " + (salario / quantidade));
        }
}
