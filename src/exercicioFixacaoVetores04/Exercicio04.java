package exercicioFixacaoVetores04;
import java.util.Scanner;
/*4.	Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números pares,
    e outro somente para números ímpares.
    Após, exiba os valores dos dois vetores na tela, em sequência.
    Obs.: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto*/
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPares = new int[10];
        int[] numerosImpares = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                numerosPares[i] = numero;
            } else {
                numerosImpares[i] = numero;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero Par: " + numerosPares[i] + " | Numero Impar: " + numerosImpares[i]);
        }
    }
}
