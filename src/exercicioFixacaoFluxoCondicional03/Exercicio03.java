package exercicioFixacaoFluxoCondicional03;
/*3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234.
        Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida.
        ACESSO NEGADO caso a senha seja inválida.*/
public class Exercicio03 {
    public static void main(String[] args) {
        String senha = "12345";
        String senhaUsuario = "12345";
        if (senhaUsuario.equals(senha)) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }
}
