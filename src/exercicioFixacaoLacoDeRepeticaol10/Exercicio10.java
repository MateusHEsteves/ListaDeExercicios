package exercicioFixacaoLacoDeRepeticaol10;
import java.util.Scanner;

/*10.	Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente,
    mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado.*/
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer contador = 0;
        while (contador < 10) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero >= 12 && numero <= 20) {
                System.out.println("Numero digitado: " + numero);
                contador++;
            } else {
                System.out.println("Entrada invalida");
            }
        }
    }
}
