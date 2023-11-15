package Programa;

import entidades.Candidato;
import entidades2.ControleDeCandidatos;
import ui.Menu;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Candidato> listaDeCandidatos = new ArrayList<>();

        System.out.println("           * Eleições * ");
        System.out.println("     ##Cadastro de Candidatos##");
        try {
            System.out.print("Entre com a quantidade de candidatos: ");
            int qtdCandidatos = sc.nextInt();

            while (qtdCandidatos <= 0){
                System.out.println("Quantidade de candidatos inválida.");
                System.out.print("Entre com a quantidade de candidatos nova: ");
                qtdCandidatos = sc.nextInt();
            }

            for (int i = 1; i <= qtdCandidatos; i++) {
                System.out.println("\nEntre com os dados do Candidato " + i);
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Partido: ");
                String partidoPolitico = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Votos: ");
                int numeroDeVotos = sc.nextInt();

                Candidato candidato = new Candidato(nome, partidoPolitico, idade, numeroDeVotos);

                while (candidato.getIdade() < 18){
                    System.out.println("Idade inválida, o candidato deve ter no mínimo 18 anos.");
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    candidato.setIdade(idade);
                }

                while (candidato.getNumeroDeVotos() < 0){
                    System.out.println("Número de votos inválido, o candidato não pode ter votos negativos.");
                    System.out.print("Votos: ");
                    numeroDeVotos = sc.nextInt();
                    candidato.setNumeroDeVotos(numeroDeVotos);
                }
                listaDeCandidatos.add(candidato);
            }
        }catch (InputMismatchException e) {
            System.out.println("Entrada inválida, digite um número inteiro.");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Menu menu = new Menu();

        try {
            do {
                Menu.menuCandidatos();

                    System.out.print("Digite uma opção: ");
                    int opcao = sc.nextInt();
                    menu.setOpcao(opcao);

                if (menu.getOpcao() == 0) {
                    System.out.println("Programa encerrado.");
                    sc.close();
                    break;
                }

                switch (menu.getOpcao()) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.encontraMaisVelho(listaDeCandidatos);
                        break;

                    case 2:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.encontraMaisNovo(listaDeCandidatos);
                        break;

                    case 3:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.encontraMaisVotado(listaDeCandidatos);
                        break;

                    case 4:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.encontraMenosVotado(listaDeCandidatos);
                        break;

                    case 5:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.calculaTotalDeVotos(listaDeCandidatos);
                        break;

                    case 6:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.calculaMediaDeVotos(listaDeCandidatos);
                        break;

                    case 7:
                        System.out.println(" ");
                        System.out.println("\nOpção escolhida: " + menu.getOpcao());
                        ControleDeCandidatos.listaInfoCandidatos(listaDeCandidatos);
                        break;

                    default:
                        System.out.print("\nOpção Inválida!");
                        break;
                }
            } while (menu.getOpcao() != 0);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, digite um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Lista vazia, não há candidatos cadastrados.");
        }
    }
}