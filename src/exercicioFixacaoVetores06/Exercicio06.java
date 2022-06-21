package exercicioFixacaoVetores06;
import java.util.Scanner;
/*6.	Modifique novamente o programa anterior, de modo a não exibir na saída os números zero que são mostrados
    para todas as posições que não receberam nenhum valor durante a atribuição (e portanto estão vazias).*/
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPares = new int[10];
        int[] numerosImpares = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Numero invalido, digite outro numero: ");
                numero = sc.nextInt();
            }
            if (numero % 2 > 0) {
                numerosPares[i] = numero;
            } else {
                numerosImpares[i] = numero;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (numerosPares[i] != 0) {
                System.out.println("Numero Par: " + numerosPares[i]);
            }
            if (numerosImpares[i] != 0) {
                System.out.println("Numero Impar: " + numerosImpares[i]);
            }
        }
    }
}

