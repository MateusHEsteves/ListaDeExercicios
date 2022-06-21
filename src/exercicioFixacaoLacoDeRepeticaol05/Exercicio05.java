package exercicioFixacaoLacoDeRepeticaol05;

import java.util.Scanner;
/*5.	Faça um programa que leia 10 números inseridos pelo usuário e imprimir
        quantos deles são pares e quantos são ímpares.*/
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        Integer contador = 0;
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        while (contador < 10) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
            contador++;
        }
        System.out.println("Quantidade de numeros pares: " + contadorPar);
        System.out.println("Quantidade de numeros impares: " + contadorImpar);
    }
}
