package exercicioFixacaoFluxoCondicional02;
/*2. Escreva um programa para ler o ano de nascimento de uma pessoa
        e escrever uma mensagem que diga se ela poderá ou não votar este ano
        (não é necessário considerar o mês em que ela nasceu).*/
public class Exercicio02 {
    public static void main(String[] args) {
        Integer anoNascimento = 1996;
        Integer anoAtual = 2022;
        Integer idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }

    }
}
