package exercicioFixacao05;
/*5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,
        em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
        Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio.
        Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida,
        exibir na tela uma mensagem contendo o resultado do volume encontrado.*/

public class Exercicio05 {

        public static void main(String[] args) {
                Double r = 3.5;
                Double a = 23.386;
                Double v = Math.PI * r * r * a;

                System.out.printf("Volume: %.2f " , v);

        }

}
