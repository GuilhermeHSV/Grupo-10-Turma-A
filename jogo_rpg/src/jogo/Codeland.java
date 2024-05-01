package jogo;

import java.util.Scanner;

public class Codeland {

    public static void tituloJogo(String titulo) { // CLasse parar
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
                break;
            case 2:
                System.out.println("Clicou em Jogar!\n ");
                jogar();
                break;
            case 3:
                System.out.println("Clicou em Créditos!\n ");
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

    public static void instrucoes() {

    }

    public static void main(String[] args) {
        introducao(); // Chamando introducao para exibir o título inicial
        selecionarOpcao();
    }
}
