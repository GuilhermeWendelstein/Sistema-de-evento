package evento;

public class Palestra {

    private String titulo;
    private String palestrante;

    public Palestra(String titulo, String palestrante) {
        this.titulo = titulo;
        this.palestrante = palestrante;
    }

    public String getTitulo() {
        return titulo;
    }

    public String resumo() {
        return "Palestra: " + titulo + " | Palestrante: " + palestrante;
    }
}
