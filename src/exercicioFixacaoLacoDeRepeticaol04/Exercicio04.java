package exercicioFixacaoLacoDeRepeticaol04;

import java.util.Scanner;

/*4.	Crie um programa que leia várias idades e calcule a média entre elas. Caso a maioria seja maior de 18 anos,
    o console deve mostrar “Aqui tem mais adultos”, se contrário, mostrar outra mensagem.*/
public class Exercicio04 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Integer idade = 0;
      Integer contador = 0;
      Integer soma = 0;
      Integer media = 0;
        System.out.println("Digite uma idade: ");
         idade = sc.nextInt();
         for (int i = 0; i < 10; i++) {
        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();
        soma = soma + idade;
        contador++;
        }
        media = soma / contador;
         if (media >= 18) {
         System.out.println("Aqui tem mais adultos");
         } else {
            System.out.println("Aqui tem mais crianças");
         }
    }
}
