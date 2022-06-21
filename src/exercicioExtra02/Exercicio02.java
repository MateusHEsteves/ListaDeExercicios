package exercicioExtra02;

import java.util.Scanner;

/*2.	Imagine uma brincadeira entre dois colegas, na qual um pensa um número e o outro deve fazer chutes até acertar o número imaginado.
    Como dica, a cada tentativa é dito se o chute foi alto ou baixo. Elabore um algoritmo dentro deste contexto,
    que leia o número digitado pelo usuário e os chutes, ao final mostre quantas tentativas foram necessárias para descobrir o número.*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer chute = 0;
        Integer tentativas = 0;
        Integer numeroSorteado = (int) (Math.random() * 100) + 1;
        System.out.println("Digite um número entre 1 e 100: ");
        numero = sc.nextInt();
        while (numero != numeroSorteado) {
            System.out.println("Digite um chute: ");
            chute = sc.nextInt();
            if (chute > numeroSorteado) {
                System.out.println("O chute foi alto.");
            } else {
                System.out.println("O chute foi baixo.");
            }
            tentativas++;
        }
        System.out.println("O número sorteado foi: " + numeroSorteado);
        System.out.println("Foram necessárias " + tentativas + " tentativas.");
    }
}
