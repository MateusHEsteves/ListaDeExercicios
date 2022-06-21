package exercicioFixacaoVetores01;

import java.util.Scanner;

/*1.	Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números na tela.
        Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        System.out.println("Soma: " + soma);
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero: " + numeros[i]);
        }
    }
}
