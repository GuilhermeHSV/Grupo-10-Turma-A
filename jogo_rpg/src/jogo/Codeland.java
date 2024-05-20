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
                "\n\n");

        String introducao = "Em mais um dia normal em seu trabalho, 'Code' trabalhava em um projeto complexo de Java, a linguagem de programação na qual tinha mais dificuldade. De repente 'Code' começou a sentir arrepios e seu computador começou a fazer barulhos estranhos. Um ponto preto apareceu em seu monitor e, por instinto, 'Code' aproximou seu rosto da tela para tentar ver melhor aquele ponto que aparentemente estava crescendo a cada segundo.\n";

        for (char letra : introducao.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Quando, de repente...");

        try {

            TimeUnit.SECONDS.sleep(10); // deixar como 20 no teste final
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String textoPortal = "\r\n" + //
                "         . :H@@@MM@M#H/.,+%;,\r\n" + //
                "      ,/X+ +M@@M@MM%=,-%HMMM@X/,\r\n" + //
                "     -+@MM; $M@@MH+-,;XMMMM@MMMM@+-\r\n" + //
                "    ;@M@@M- XM@X;. -+XXXXXHHH@M@M#@/.\r\n" + //
                "  ,%MM@@MH ,@%=            .---=-=:=,.\r\n" + //
                "  -@#@@@MX .,              -%HX$$%%%+;\r\n" + //
                " =-./@M@M$                  .;@MMMM@MM:\r\n" + //
                " X@/ -$MM/                    .+MM@@@M$\r\n" + //
                ",@M@H: :@:                    . -X#@@@@-\r\n" + //
                ",@@@MMX, .                    /H- ;@M@M=\r\n" + //
                ".H@@@@M@+,                    %MM+..%#$.\r\n" + //
                " /MMMM@MMH/.                  XM@MH; -;\r\n" + //
                "  /%+%$XHH@$=              , .H@@@@MX,\r\n" + //
                "   .=--------.           -%H.,@@@@@MX,\r\n" + //
                "   .%MM@@@HHHXX$$$%+- .:$MMX -M@@MM%.\r\n" + //
                "     =XMMM@MM@MM#H;,-+HMM@M+ /MMMX=\r\n" + //
                "       =%@M@M#@$-.=$@MM@@@M; %M%=\r\n" + //
                "         ,:+$+-,/H#MMMMMMM@- -,\r\n" + //
                "               =++%%%%+/:-.";

        for (char caractere : textoPortal.toCharArray()) {
            System.out.print(caractere);
            try {
                // Atraso nos caracteres
                TimeUnit.MILLISECONDS.sleep(15); // deixar nos 15
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {

            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String introducaoDois = "\n\n'Code' é sugado por um portal que se abre no monitor do seu computador. Ele acorda em um mundo de código em constante mutação. \n De longe ele percebe um painel com o nome : \n\n";

        for (char letra : introducaoDois.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String[] textoJogo = {
                "\r\n" + //
                        "   ____          _      _                 _ \r\n" + //
                        "  / ___|___   __| | ___| | __ _ _ __   __| |\r\n" + //
                        " | |   / _ \\ / _` |/ _ \\ |/ _` | '_ \\ / _` |\r\n" + //
                        " | |__| (_) | (_| |  __/ | (_| | | | | (_| |\r\n" + //
                        "  \\____\\___/ \\__,_|\\___|_|\\__,_|_| |_|\\__,_|\r\n" + //
                        "                                            \r\n\n"
        };

        for (String linha : textoJogo) {
            for (char caractere : linha.toCharArray()) {
                System.out.print(caractere);
                try {
                    // Atraso do tempo para um efeito de digitação
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        String introducaoMentorVirtual = "\"Enquanto 'Code' olhava perplexo para aquele painel, pensando em como ele foi parar naquele lugar estranhamente familiar, um homem se aproximava no horizonte.\nEra um homem de estatura baixa, careca e com uma barba mal feita, vestindo um sobretudo marrom e óculos 'tecnológicos'.\nEle se aproximou de 'Code' apresentando-se como: 'O Mentor Virtual'\n";

        for (char letra : introducaoMentorVirtual.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String dialogo = "\nMentor Virtual: \"Bem-vindo, Code. Você foi escolhido para salvar CodeLand. Este mundo está em perigo devido ao NebulaShadow, que corrompeu nosso código, deixando nossa cidade toda em um caos total. Para restaurar a ordem, você deve enfrentar vários desafios envolvendo todo o seu conhecimento em programação, mais especificamente, você terá que usar o nosso queridinho 'JAVA'.\n"
                +
                "\nCode: 'Tinha que ser logo Java? A linguagem de programação que eu mais tenho dificuldade!'\n" +
                "\nMentor Virtual: 'Não se preocupe! Eu estou aqui justamente para te auxiliar no começo para que você consiga derrotar o chefão.\nVamos depressa para a cidade, vou te mostrar o básico por agora!\n";

        for (char letra : dialogo.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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
