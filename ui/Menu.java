package ui;

public class Menu {
    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Menu() {

    }
    public Menu(int opcao) {
        this.opcao = opcao;
    }

    public static void menuCandidatos() {
        System.out.println("\n          ##--Menu de candidatos--##");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("| Opção 1 - Candidato mais velho                             |");
        System.out.println("| Opção 2 - Candidato mais novo                              |");
        System.out.println("| Opção 3 - Candidato mais votado                            |");
        System.out.println("| Opção 4 - Candidato menos votado                           |");
        System.out.println("| Opção 5 - Total de votos recebidos por todos os candidatos |");
        System.out.println("| Opção 6 - Média de votos recebidos pelos candidatos        |");
        System.out.println("| Opção 7 - Informações dos candidatos                       |");
        System.out.println("| Opção 0 - (sair)                                           |");
        System.out.println("|------------------------------------------------------------|");
    }
}



