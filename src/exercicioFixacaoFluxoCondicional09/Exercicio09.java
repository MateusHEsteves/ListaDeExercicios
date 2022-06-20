package exercicioFixacaoFluxoCondicional09;
/*9. Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
        Considere que o usuário não informará valores iguais.*/
public class Exercicio09 {
    public static void main(String[] args) {
        Integer valor1 = 10;
        Integer valor2 = 20;
        Integer valor3 = 30;

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é: " + valor2);
        } else if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O maior valor é: " + valor3);
        }
    }
}
