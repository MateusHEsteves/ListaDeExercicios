package exercicioFixacaoLacoDeRepeticaol03;

import java.util.Scanner;

/*3.	Faça um programa que leia um valor inteiro inserido pelo usuário e resulte na tabuada de 1 a 10 do valor lido.
        Aceitar somente valores entre 1 e 10.*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer contador = 0;
        Integer resultado = 0;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        while (contador < 10) {
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
    }
}
