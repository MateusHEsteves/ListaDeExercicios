package exercicioFixacao06;
/*6. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas
        a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999*/

public class Exercicio06 {
    public static void main(String[] args) {
        Double massa = 100.0;
        Double altura = 2.0;
        Double tempo = 10.0;
        Double cavalos = (massa * altura / tempo) / 745.6999;
        System.out.println("Cavalos: " + cavalos);
    }

}
