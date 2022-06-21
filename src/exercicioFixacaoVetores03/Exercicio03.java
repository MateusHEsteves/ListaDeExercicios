package exercicioFixacaoVetores03;
/*3.	Crie um programa que solicite a entrada de 10 números pelo usuário, armazenando-os em um vetor,
    e então monte outro vetor com os valores do primeiro multiplicados por 5.
    Exiba os valores dos dois vetores na tela, simultaneamente, em duas colunas (um em cada coluna), uma posição por linha.*/
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numerosMultiplicadosPor5 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
            numerosMultiplicadosPor5[i] = numeros[i] * 5;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + numeros[i] + " | Numero Multiplicado por 5: " + numerosMultiplicadosPor5[i]);
        }
    }
}
