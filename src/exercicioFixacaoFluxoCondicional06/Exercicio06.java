package exercicioFixacaoFluxoCondicional06;
/*6. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1 :feminino, 2: masculino,
        construa um programa que calcule e imprima seu peso ideal,
        utilizando as seguintes fórmulas: - para homens: (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7*/
public class Exercicio06 {
    public static void main(String[] args) {
        Double altura = 1.75;
        Double pesoIdeal;

        if (altura < 1.70) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.println("Peso ideal: " + pesoIdeal);
    }
}
