package entidades2;

import entidades.Candidato;

import java.util.List;

public class ControleDeCandidatos {

    public static void validaLista (List<Candidato> ListaCandidatos){
        if (ListaCandidatos.isEmpty())
            System.out.println("Não há candidatos cadastrados.");
    }

    public static void encontraMaisNovo (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        Candidato maisNovo = ListaCandidatos.get(0); /* assume inicialmente que o primeiro candidato da lista é
          o mais novo */

        for (Candidato candidato : ListaCandidatos) {
            if (candidato.getIdade() < maisNovo.getIdade()){
                maisNovo = candidato;
            }
        }

        System.out.println("Candidato mais novo: " + maisNovo.getNome() + " com " + maisNovo.getIdade() + " anos.");
    }

    public static void encontraMaisVelho (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        Candidato maisVelho = ListaCandidatos.get(0); /* assume inicialmente que o primeiro candidato da lista é
        o mais velho */

        for (Candidato candidato : ListaCandidatos) {
            if (candidato.getIdade() > maisVelho.getIdade()){
                maisVelho = candidato;
            }
        }

        System.out.println("Candidato mais velho: " + maisVelho.getNome() + " com " + maisVelho.getIdade() + " anos.");
    }

    public static void encontraMaisVotado (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        Candidato maisVotado = ListaCandidatos.get(0); /* assume inicialmente que o primeiro candidato da lista é
          o mais votado */

        for (Candidato candidato : ListaCandidatos) {
            if (candidato.getNumeroDeVotos() > maisVotado.getNumeroDeVotos()){
                maisVotado = candidato;
            }
        }

        System.out.println("Candidato mais votado: " + maisVotado.getNome() + " com " + maisVotado.getNumeroDeVotos() + " votos.");
    }

    public static void encontraMenosVotado (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        Candidato menosVotado = ListaCandidatos.get(0); /* assume inicialmente que o primeiro candidato da lista é
          o menos votado */

        for (Candidato candidato : ListaCandidatos) {
            if (candidato.getNumeroDeVotos() < menosVotado.getNumeroDeVotos()){
                menosVotado = candidato;
            }
        }

        System.out.println("Candidato menos votado: " + menosVotado.getNome() + " com " + menosVotado.getNumeroDeVotos() + " votos.");
    }

    public static void calculaTotalDeVotos (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        int totalDeVotos = 0;

        for (Candidato candidato : ListaCandidatos) {
            totalDeVotos += candidato.getNumeroDeVotos();
        }

        System.out.println("Total de votos recebidos por todos os candidatos: " + totalDeVotos + " votos.");
    }

    public static void calculaMediaDeVotos (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        int totalDeVotos = 0;
        int totalDeCandidatos = 0;
        for (Candidato candidato : ListaCandidatos) {
            totalDeVotos += candidato.getNumeroDeVotos();
            totalDeCandidatos += 1;
        }

        int mediaDeVotos = totalDeVotos/totalDeCandidatos;

        System.out.println("Média de votos recebidos pelos candidatos: " + mediaDeVotos + " votos.");
    }

    public static void listaInfoCandidatos (List<Candidato> ListaCandidatos) {
        validaLista(ListaCandidatos);

        System.out.println("* Informações dos candidatos * ");
        for (Candidato candidato : ListaCandidatos) {

            System.out.println("\n[ Candidato: " + candidato.getNome() + " ]\n Partido Político: " + candidato.getPartidoPolitico() +
                    "\n Idade: " + candidato.getIdade() + "\n Número de votos: " + candidato.getNumeroDeVotos());
        }
    }
}
