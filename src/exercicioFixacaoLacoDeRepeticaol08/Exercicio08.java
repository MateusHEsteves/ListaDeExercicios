package exercicioFixacaoLacoDeRepeticaol08;

import java.util.Scanner;

/*8.	Crie um programa para ler 3 notas inseridas por um aluno e mostrar a média delas. Caso a média seja menor que 6.0,
    o console deverá constar sua média + a mensagem de reprovado.
    Se maior ou igual, conste sua média + mensagem de aprovação.*/
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double media =0.0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota: ");
            Double nota = sc.nextDouble();
            media = nota / 3;
            continue;
        }
        if (media < 6) {
            System.out.println("Sua media foi: " + media + " e você foi reprovado");
        } else {
            System.out.println("Sua media foi: " + media + " e você foi aprovado");
        }
    }
}
