package exercicioExtra01;

import java.util.Scanner;

/*1.	Três candidatos concorreram a uma eleição (A, B, C). O usuário deve informar quantos votos cada candidato recebeu,
        quantos foram os votos brancos e quantos foram os votos nulos. O algoritmo deve calcular e informar:
        o número total de eleitores, o percentual de votos que cada candidato recebeu
        (em relação ao número total de eleitores), o percentual de brancos e o percentual de nulos.*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer votosA = 0;
        Integer votosB = 0;
        Integer votosC = 0;
        Integer votosBrancos = 0;
        Integer votosNulos = 0;
        Integer totalVotos = 0;
        Double percentualA = 0.0;
        Double percentualB = 0.0;
        Double percentualC = 0.0;
        Double percentualBrancos = 0.0;
        Double percentualNulos = 0.0;
        Double totalEleitores = 0.0;

        System.out.println("Digite o número de votos do candidato A: ");
        votosA = sc.nextInt();
        System.out.println("Digite o número de votos do candidato B: ");
        votosB = sc.nextInt();
        System.out.println("Digite o número de votos do candidato C: ");
        votosC = sc.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        votosBrancos = sc.nextInt();
        System.out.println("Digite o número de votos nulos: ");
        votosNulos = sc.nextInt();

        totalVotos = votosA + votosB + votosC;
        totalEleitores = Double.valueOf(totalVotos + votosBrancos + votosNulos);
        percentualA = Double.valueOf((votosA * 100) / totalVotos);
        percentualB = Double.valueOf((votosB * 100) / totalVotos);
        percentualC = Double.valueOf((votosC * 100) / totalVotos);
        percentualBrancos = (votosBrancos * 100) / totalEleitores;
        percentualNulos = (votosNulos * 100) / totalEleitores;

        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos do candidato A: " + percentualA + "%");
        System.out.println("Percentual de votos do candidato B: " + percentualB + "%");
        System.out.println("Percentual de votos do candidato C: " + percentualC + "%");
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

    }
}
