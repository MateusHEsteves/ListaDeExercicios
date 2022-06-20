package exercicioFixacaoFluxoCondicional08;
/*8. Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
        − Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
        − Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.*/

public class Exercicio08 {
    public static void main(String[] args) {
        Integer lados = 4;
        Integer numeroLados = lados;

        if (numeroLados < 3) {
            System.out.println("Não é um polígono");
        } else if (numeroLados > 5) {
            System.out.println("Polígono não identificado");
        } else {
            System.out.println("É um polígono");
        }
    }
}
