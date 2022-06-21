package exercicioFixacaoVetores02;
import java.util.Scanner;
/*2.	Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
    Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.*/
public class Exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Nome: " + nomes[i]);
        }
    }
}
