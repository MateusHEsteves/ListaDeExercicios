package exercicioFixacaoFluxoCondicional10;
/*10. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
        − Triângulo Equilátero: possui os 3 lados iguais.
        − Triângulo Isóscele: possui 2 lados iguais.
        − Triângulo Escaleno: possui 3 lados diferentes.*/
public class Exercicio10 {
    public static void main(String[] args) {
        Double lado1 = 5.0;
        Double lado2 = 6.0;
        Double lado3 = 7.0;

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo Isóscele");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
