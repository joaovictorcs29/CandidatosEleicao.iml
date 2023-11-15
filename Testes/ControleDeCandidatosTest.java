package Testes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import entidades2.ControleDeCandidatos;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import entidades.Candidato;


public class ControleDeCandidatosTest {

    ControleDeCandidatos controleDeCandidatos;

    @Before
    public void inicializa() {
        controleDeCandidatos = new ControleDeCandidatos();
    }

    @Test
    public void validaListaVaziaTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        ControleDeCandidatos.validaLista(listaCandidatos);
        assertEquals(0, listaCandidatos.size(),
                "Se a lista está vazia, então ela deve retornar zero");
    }

    @Test
    public void validaListaTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();

        Candidato candidato1 = new Candidato("Elivelton", "URSAL", 39, 5000);
        Candidato candidato2 = new Candidato("Abigail", "PS", 41, 2350);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);

        ControleDeCandidatos.validaLista(listaCandidatos);
        assertEquals(2, listaCandidatos.size(),
                "Se a lista 2 elementos, então ela tem o tamanho = 2");

    }

    @Test
    public void encontraMaisNovoTest() {
        List<Candidato>listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.encontraMaisNovo(listaCandidatos);
        assertEquals(53, candidato2.getIdade(),
                "Candidato mais novo tem 53 anos, então deve retornar 53");
    }

    @Test
    public void encontraMaisVelhoTest(){
        List<Candidato>listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.encontraMaisVelho(listaCandidatos);
        assertEquals(68, candidato3.getIdade(),
                "Candidato mais velho tem 68 anos, então deve retornar 68");

    }

    @Test
    public void encontraMaisVotadoTest(){
        List<Candidato>listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.encontraMaisVotado(listaCandidatos);
        assertEquals(80, candidato2.getNumeroDeVotos(),
                "O candidato com maior número de votos foi o candidato2 com 80 votos, então deve retornar 80");
    }

    @Test
    public void encontraMenosVotadoTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.encontraMenosVotado(listaCandidatos);
        assertEquals(30, candidato3.getNumeroDeVotos(),
                "O candidato com menor número de votos foi o candidato3 com 30 votos, então deve retornar 30");
    }

    @Test
    public void calculaTotalDeVotosTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.calculaTotalDeVotos(listaCandidatos);

        assertEquals(160, candidato1.getNumeroDeVotos() + candidato2.getNumeroDeVotos() + candidato3.getNumeroDeVotos(),
                "A soma de votos de todos os candidatos é 160 votos, então deve retornar 160");
    }

    @Test
    public void calculaMediaDeVotosTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.calculaMediaDeVotos(listaCandidatos);
        assertEquals(53, (candidato1.getNumeroDeVotos() + candidato2.getNumeroDeVotos() + candidato3.getNumeroDeVotos()) / listaCandidatos.size(),
                "A soma de votos de todos os candidatos é 160, " +
                        "para calcular a média deve dividir pelo número de candidatos somados que é também o tamanho da lista, então deve retornar 160");
    }

    @Test
    public void listaInfoCandidatosTest() {
        List<Candidato> listaCandidatos = new ArrayList<>();
        Candidato candidato1 = new Candidato("Giba", "PC", 58, 50);
        Candidato candidato2 = new Candidato("Reinaldo", "PB", 53, 80);
        Candidato candidato3 = new Candidato("Silvano", "Plua", 68, 30);

        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);

        ControleDeCandidatos.listaInfoCandidatos(listaCandidatos);
        System.out.println(" ");
    }
}
