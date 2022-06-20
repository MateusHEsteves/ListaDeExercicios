package exercicioFixacao01;

public class Exercicio01 {

 /*   1. Escreva um programa que, com base em uma temperatura em graus celsius,
    a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
    seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.678?*/

    public static void main(String[] args) {
        Double Celsius = 35.0;

        Double kelvin = Celsius + 273.15;
        Double réaumur = Celsius * 0.8;
        Double Rankine = Celsius * 1.8 + 32 + 459.678;
        Double Fahrenheit = Celsius * 1.8 + 32;

        System.out.println("Celsius: " + kelvin);
        System.out.println("Réaumur: " + réaumur);
        System.out.println("Rankine: " + Rankine);
        System.out.println("Fahrenheit: " + Fahrenheit);


    }

}
