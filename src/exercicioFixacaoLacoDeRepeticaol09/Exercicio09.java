package exercicioFixacaoLacoDeRepeticaol09;

import java.util.Scanner;

/*9.	Faça um programa que mostre a tabuada de um número que seja inserido pelo usuário*/
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer contador = 0;
        Integer resultado = 0;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        while (contador <= 10) {
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
    }
}
