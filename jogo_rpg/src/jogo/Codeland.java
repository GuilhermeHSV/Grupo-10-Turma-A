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

        System.out.println("\nSelecione uma opção:"); // classe de Título para seleção de opções
        System.out.println("1 - Instruções \n2 - Jogar \n3 - Créditos \n4 - Sair");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Clicou em Instruções!\n ");
                instrucoes();
                break;
            case 2:
                System.out.println("Clicou em Jogar!\n ");
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
        scanner.close();
    }

    public static void instrucoes() { // Classe para ver as instruções do Jogo
        System.out.println("Adicionar Instruções");
    }

    public static void jogar() { // Classe para começar a jogar o RPG
        System.out.println("\r\n" + //
                "   ____          _      _                 _ \r\n" + //
                "  / ___|___   __| | ___| | __ _ _ __   __| |\r\n" + //
                " | |   / _ \\ / _` |/ _ \\ |/ _` | '_ \\ / _` |\r\n" + //
                " | |__| (_) | (_| |  __/ | (_| | | | | (_| |\r\n" + //
                "  \\____\\___/ \\__,_|\\___|_|\\__,_|_| |_|\\__,_|\r\n" + //
                "                                            \r\n" + //
                "");

        System.out.println(
                "Você é um(a) jovem aspirante a programador(a) prestes a embarcar em uma jornada emocionante pelo mundo da programação Java. Sua aventura começa em uma pequena vila chamada Codeland, onde a magia da codificação dá vida a máquinas e dispositivos incríveis.\n");
    }

    public static void creditos() {
        System.out.println("Créditos\r\n" + //
                "\r\n" + //
                "Desenvolvimento do Jogo:\r\n" + //
                
                "- Programação: [Guilherme Vasconcellos, Jhonny Lucca, Giovanni Campos, Lucas Coelho]\r\n" + //
                "\r\n" + //
                "Tecnologias Utilizadas:\r\n" + //
                "- Linguagens: [Java]\r\n" + //
                "- Bibliotecas e Frameworks: [##]\r\n" + //
                "\r\n" + //
                "Copyright [2024] Codeland. Todos os direitos reservados.\r\n" + //
                "");
    }

    public static void main(String[] args) {
        introducao(); // Chamando introducao para exibir o título inicial
        selecionarOpcao();
    }
}
