package exercicioFixacaoFluxoCondicional11;
/*11. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
        − Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
        − Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
        − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)*/
public class Exercicio11 {
    public static void main(String[] args) {
        Double angulo1 = 45.0;
        Double angulo2 = 60.0;
        Double angulo3 = 90.0;

        if (angulo1 == 90 || angulo2 == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }
    }
}

