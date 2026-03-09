# Sistema-de-evento
package evento;

public class Main {

    public static void main(String[] args) {

        evento evento = new evento("Tech Conference 2026");

        Participante p1 = new Participante("Guilherme", "gui@email.com");
        Participante p2 = new Participante("Ana", "ana@email.com");

        Palestra pal1 = new Palestra("Segurança Cibernética", "Carlos Silva");
        Palestra pal2 = new Palestra("Inteligência Artificial", "Maria Souza");

        Ingresso i1 = new Ingresso(1, 150.0);
        Ingresso i2 = new Ingresso(2, 150.0);

        evento.adicionarParticipante(p1);
        evento.adicionarParticipante(p2);

        evento.adicionarPalestra(pal1);
        evento.adicionarPalestra(pal2);

        evento.adicionarIngresso(i1);
        evento.adicionarIngresso(i2);

        evento.relatorio();
    }
}
