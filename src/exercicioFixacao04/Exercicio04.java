package exercicioFixacao04;

import java.util.Scanner;

/*4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
        precisa ser coberta por azulejos também retangulares.
        O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
        Escreva um programa que leia as quatro medidas hp, lp, ha e la,
        calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.*/
public class Exercicio04 {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a altura da parede: ");
                Double hp = sc.nextDouble();

                System.out.println("Digite a largura da parede: ");
                Double lp = sc.nextDouble();

                System.out.println("Digite a altura do azulejo: ");
                Double ha = sc.nextDouble();

                System.out.println("Digite a largura do azulejo: ");
                Double la = sc.nextDouble();

                System.out.println("Quantidade de azulejos necessários: " + (hp / ha) * (lp / la));
        }
}
