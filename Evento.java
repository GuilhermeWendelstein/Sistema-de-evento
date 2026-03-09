package evento;

public class evento {

    private String nome;

    private java.util.List<Participante> participantes;
    private java.util.List<Palestra> palestras;
    private java.util.List<Ingresso> ingressos;

    public evento(String nome) {

        this.nome = nome;

        participantes = new java.util.ArrayList<>();
        palestras = new java.util.ArrayList<>();
        ingressos = new java.util.ArrayList<>();
    }


    public boolean adicionarParticipante(Participante p) {

        if (p == null) return false;


        for (Participante part : participantes) {
            if (part.getEmail().equals(p.getEmail())) {
                return false;
            }
        }

        participantes.add(p);
        return true;
    }

    public boolean adicionarPalestra(Palestra p) {

        if (p == null) return false;


        for (Palestra pal : palestras) {
            if (pal.getTitulo().equals(p.getTitulo())) {
                return false;
            }
        }

        palestras.add(p);
        return true;
    }

    public boolean adicionarIngresso(Ingresso i) {

        if (i == null) return false;


        for (Ingresso ing : ingressos) {
            if (ing.getCodigo() == i.getCodigo()) {
                return false;
            }
        }

        ingressos.add(i);
        return true;
    }

    public void relatorio() {

        System.out.println("=== EVENTO: " + nome + " ===");

        System.out.println("\nParticipantes:");
        for (Participante p : participantes) {
            System.out.println(p.resumo());
        }

        System.out.println("\nPalestras:");
        for (Palestra p : palestras) {
            System.out.println(p.resumo());
        }

        System.out.println("\nIngressos:");
        for (Ingresso i : ingressos) {
            System.out.println(i.resumo());
        }
    }
}
