package estudoDeCaso03;
/*Antigamente, era muito comum que jovens frequentassem locadoras e alugassem filmes e jogos para verem em suas casas. Vamos supor que elas ainda existem e precisamos modernizar o sistema para registro e controle do fluxo de entrada e saída desses objetos.
        Todos os filmes devem estar cadastrados com dados pertinentes referente à cada um, individualmente.
        Os filmes serão separados de acordo com seu gênero e sua faixa etária.
        As fitas desse filme também possuem um número identificador, pois o mesmo filme pode existir em diversas fitas diferentes.
        As fitas são os objetos as serem disponibilizados pelos clientes que deverão ser cadastrados na loja no ato da retirada do empréstimo e para controle da devolução.*/
public class Locadora {
    public static void main(String[] args) {
        Fitas fitas = new Fitas();
        fitas.setGenero(Genero.TERROR);
        fitas.setFaixaEtaria("18 anos");
        fitas.setNumeroIdentificador(randomInt(1, 100));
        System.out.println(fitas.getGenero().getDescription());
        System.out.println(fitas.getFaixaEtaria());
        System.out.println(fitas.getNumeroIdentificador());

    }

    private static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
