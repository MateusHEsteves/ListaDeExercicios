package exercicioFixacaoFluxoCondicional07;
/*7. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
        − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
        − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
        − Se o número de lados for igual a 5 escrever PENTÁGONO.*/
public class Exercicio07 {
    public static void main(String[] args) {
        Integer lados = 3;
        Double lado = 10.0;
        Double area;
        String tipo;

        if (lados == 3) {
            tipo = "TRIÂNGULO";
            area = (lado * lado) * (Math.sqrt(3) / 4);
            System.out.println("Tipo: " + tipo);
            System.out.println("Área: " + area);
        } else if (lados == 4) {
            tipo = "QUADRADO";
            area = lado * lado;
            System.out.println("Tipo: " + tipo);
            System.out.println("Área: " + area);
        } else if (lados == 5) {
            tipo = "PENTÁGONO";
            area = (lado * lado) * (3 / 2);
            System.out.println("Tipo: " + tipo);
        } else {
            tipo = "NÃO É UM POLÍGONO REGULAR";
            area = 0.0;
        }
    }
}
