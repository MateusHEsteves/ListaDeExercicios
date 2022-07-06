package exercicioFixacaoVetores05;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
/*5.	Modifique o programa anterior para não aceitar a entrada do número zero,
    e requisitar a digitação de outro número neste caso.*/
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPares = new int[10];
        int[] numerosImpares = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            while (numero == 0){
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
            System.out.println("Numero Par: " + numerosPares[i] + " | Numero Impar: " + numerosImpares[i]);
        }
    }
}
