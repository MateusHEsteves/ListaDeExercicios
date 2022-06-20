package exercicioFixacaoFluxoCondicional01;
/*1. Escreva um programa para ler 2 valores
(considere que não serão informados valores iguais) e escrever o maior deles.*/
public class Exercicio01 {
    public static void main(String[] args) {
        Integer valor1 = 10;
        Integer valor2 = 20;

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }
}
