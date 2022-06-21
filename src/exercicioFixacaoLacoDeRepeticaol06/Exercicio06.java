package exercicioFixacaoLacoDeRepeticaol06;
import java.util.Scanner;
/*6.	Utilizando a estrutura de repetição for, faça um programa que receba 10 números
    e conte quantos deles estão no intervalo [10, 20] e quantos deles estão fora do intervalo,
        escrevendo estas informações. (DESAFIO)*/
public class Exercicio06 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer contador = 0;
        Integer contadorIntervalo = 0;
        Integer contadorForaIntervalo = 0;
        while (contador < 10) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero >= 10 && numero <= 20) {
                contadorIntervalo++;
            } else {
                contadorForaIntervalo++;
            }
            contador++;
        }
        System.out.println("Quantidade de numeros no intervalo: " + contadorIntervalo);
        System.out.println("Quantidade de numeros fora do intervalo: " + contadorForaIntervalo);
    }
}
