package jogo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Codeland {

    public static void tituloJogo(String titulo) { // CLasse para exibir o Título do Jogo RPG
        System.out.println("#".repeat(titulo.length()));
        System.out.println(titulo);
        System.out.println("#".repeat(titulo.length()));
    }

    public static void introducao() { // classe para Definir o título e a introdução
        String titulo = "\nSeja Bem-vindo à Codeland!!!\n";
        tituloJogo(titulo);

    }

    public static void selecionarOpcao() {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("\nSelecione uma opção:"); // classe de Título para seleção de opções
            System.out.println("1 - Instruções \n2 - Jogar \n3 - Créditos \n4 - Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Clicou em Instruções!\n ");
                    instrucoes();
                    break;
                case 2:
                    jogar();
                    break;
                case 3:
                    System.out.println("Clicou em Créditos!\n ");
                    creditos();
                    break;
                case 4:
                    System.out.println("Clicou em Sair! Volte Sempre!\n ");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
            ; // Condição de saída do loop
        } while (escolha != 2 && escolha != 4);
        scanner.close();
    }

    public static void instrucoes() { // Classe para ver as instruções do Jogo

        System.out.println(
                "Você assume o papal de 'Code', um jovem programador talentoso, que é transportado para um mundo virtual de CodeLand, após um estranho incidente no laboratório de programação de sua universidade. CodeLand é um mundo digital que personifica os conceitos da programação que todos conhecemos, onde o código ganha vida. Este mundo está à beira do colapso devido à presença de 'NebulaShadow', um vilão que corrompeu o código fonte de CodeLand. Para restaurar a ordem, Code deve resolver desafios e responder perguntas sobre Java, sua linguagem de programação mais temida, enfrentando diversos Bugs e inimigos até chegar ao NebulaShadow.");
        System.out.println("ADICIONAR MAIS");
    }

    public static void jogar() {

        System.out.println("Capítulo 1: ");
        System.out.println("\r\n" + //
                "   ___      ___                          _             \r\n" + //
                "  /___\\    /   \\___  ___ _ __   ___ _ __| |_ __ _ _ __ \r\n" + //
                " //  //   / /\\ / _ \\/ __| '_ \\ / _ \\ '__| __/ _` | '__|\r\n" + //
                "/ \\_//   / /_//  __/\\__ \\ |_) |  __/ |  | || (_| | |   \r\n" + //
                "\\___/   /___,' \\___||___/ .__/ \\___|_|   \\__\\__,_|_|   \r\n" + //
                "                        |_|                            \r\n" + //
                "");

    }

    public static void creditos() {
        System.out.println("Créditos\r\n" + //
                "\r\n" + //
                "Desenvolvimento do Jogo:\r\n" + //

                "- Programação: [Guilherme Vasconcellos, Giovanni Campos, Lucas Coelho]\r\n" + //
                "\r\n" + //
                "Tecnologias Utilizadas:\r\n" + //
                "- Linguagens: [Java]\r\n" + //
                "\\n" +
                "Copyright [2024] Codeland. Todos os direitos reservados.\r\n" + //
                "");
    }

    public static void main(String[] args) {
        introducao(); // Chamando introdução para exibir o título inicial
        selecionarOpcao();
    }
}
