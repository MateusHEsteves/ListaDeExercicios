package exercicioFixacaoFluxoCondicional05;
    /*5. Escreva um programa para ler 3 valores inteiros
        (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/

public class Exercicio05 {
    public static void main(String[] args) {
        Integer valor1 = 30;
        Integer valor2 = 10;
        Integer valor3 = 20;

        if (valor1 > valor2) {
            if (valor1 > valor3) {
                if (valor2 > valor3) {
                    System.out.println(valor1 + " " + valor2 + " " + valor3);
                } else {
                    System.out.println(valor1 + " " + valor3 + " " + valor2);
                }
            } else {
                System.out.println(valor3 + " " + valor1 + " " + valor2);
            }
        } else {
            if (valor2 > valor3) {
                if (valor1 > valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                } else {
                    System.out.println(valor2 + " " + valor3 + " " + valor1);
                }
            } else {
                System.out.println(valor3 + " " + valor2 + " " + valor1);
            }
        }
    }
}

