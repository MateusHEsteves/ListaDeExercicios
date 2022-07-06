package estudoDeCaso03;

public enum Genero {

    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    FICCAO("Ficção"),
    TERROR("Terror"),
    ACAO("Ação"),
    SUSPENSE("Suspense");

    private String description;

    private Genero(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}