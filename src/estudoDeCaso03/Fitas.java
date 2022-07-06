package estudoDeCaso03;

public class Fitas {

    private Genero genero;
    private String faixaEtaria;
    private Integer numeroIdentificador;

    public Fitas() {
    }

    public Fitas(Genero genero, String faixaEtaria, Integer numeroIdentificador) {
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.numeroIdentificador = numeroIdentificador;
    }

    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    public Integer getNumeroIdentificador() {
        return numeroIdentificador;
    }
    public void setNumeroIdentificador(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }
}
