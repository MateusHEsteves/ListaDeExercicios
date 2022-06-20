package exercicioFixacaoFluxoCondicional04;
/*4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
        e R$ 0,25 se forem compradas pelo menos doze.
        Escreva um programa que leia o número de maçãs compradas,
        calcule e escreva o valor total da compra.*/
public class Exercicio04 {
    public static void main(String[] args) {
        Integer quantidade = 20;
        Double preco = 0.30;
        Double preco2 = 0.25;
        Double total = 0.0;
        if (quantidade < 12) {
            total = quantidade * preco;
        } else {
            total = quantidade * preco2;
        }
        System.out.println("Total: " + total);
    }
}
