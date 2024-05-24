package jogo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Codeland {

    public static int Vidas(int quantidade){
        int vidas = quantidade;
        return vidas;
    }

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
                "O jogo funcionará mostrando diálogos na tela e contendo até 3 opções de respostas variadas, que afetam diretamente a jogabilidade e o progresso. Você terá 3 vidas, onde se chegar a 0 o jogo acaba, para você perder vidas é necessário errar as perguntas.");
        System.out.println("ADICIONAR MAIS");
    }

    public static void perguntaUm() {
        String primeiraPergunta = "Você escolheu ficar e lutar contra o Monstro de metal!\nEle vem correndo em sua direção em alta velocidade e você fica paralisado de medo!\nMentor Virtual:'Code! Não se preocupe, ele não vai fazer nada com você... pelo menos por enquanto HAHAHA!'\nCode:O QUE VOCÊ QUER DIZER COM ISSO?";

        for (char letra : primeiraPergunta.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(30); // deixar 30
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String primeiraPerguntaDois = "O mostro chega perto de você...'";

        for (char letra : primeiraPerguntaDois.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(100); // deixar 100
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String primeiraPerguntaTres = "E simplesmente para. Abrindo uma tela em seu olho, que mostra um quiz para você responder:'";

        for (char letra : primeiraPerguntaTres.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(100); // deixar 100
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\r\n" + //
                "  ____                            _                                                                          \r\n"
                + //
                " |  _ \\ ___ _ __ __ _ _   _ _ __ | |_ __ _     _   _ _ __ ___  _                                             \r\n"
                + //
                " | |_) / _ \\ '__/ _` | | | | '_ \\| __/ _` |   | | | | '_ ` _ \\(_)                                            \r\n"
                + //
                " |  __/  __/ | | (_| | |_| | | | | || (_| |   | |_| | | | | | |_                                             \r\n"
                + //
                " |_|   \\___|_|  \\__, |\\__,_|_| |_|\\__\\__,_|    \\__,_|_| |_| |_(_)                                            \r\n"
                + //
                "   ____         |___/                     /\\/|             _       __     __         _   __            _     \r\n"
                + //
                "  |  _ \\  ___  ___| | __ _ _ __ __ _  ___|/\\/_  ___     __| | ___  \\ \\   / /_ _ _ __(_) /_/___   _____(_)___ \r\n"
                + //
                "  | | | |/ _ \\/ __| |/ _` | '__/ _` |/ __/ _` |/ _ \\   / _` |/ _ \\  \\ \\ / / _` | '__| |/ _` \\ \\ / / _ \\ / __|\r\n"
                + //
                "  | |_| |  __/ (__| | (_| | | | (_| | (_| (_| | (_) | | (_| |  __/   \\ V / (_| | |  | | (_| |\\ V /  __/ \\__ \\\r\n"
                + //
                "  |____/ \\___|\\___|_|\\__,_|_|  \\__,_|\\___\\__,_|\\___/   \\__,_|\\___|    \\_/ \\__,_|_|  |_|\\__,_| \\_/ \\___|_|___/\r\n"
                + //
                "                                      )_)                                                                    \r\n"
                + //
                "");

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int quantidade = 3;
        while (true) {
            System.out.println(
                    "Qual é a sintaxe correta para declarar uma variável inteira em Java\n\n1 - integer x = 10\n2 - int x = 10\n3 - num x = 10");
            escolha = scanner.nextInt();

            if (escolha == 2) {
                System.out.println("você acertou!");
                System.out.println("O quiz que estava no rosto do monstro se apaga e ele simplesmente congela, como se estivesse sem energia!\n Monstro de metal: Eu voltarei!");
                break;
            } else if (escolha == 1 || escolha == 3) {
                System.out.println(
                        "Errou! Tente novamente!");
                        quantidade --;
                        Vidas(quantidade);
                        System.out.println("Você perdeu uma vida! Você está agora com " + quantidade);
                        if(quantidade == 0 ){
                            System.out.println("O jogo acabou! Você está sem vidas!");
                            break;
                        }

            } else {
                System.out.println("Por favor, escolha uma opção válida (1, 2 ou 3)!");
            }
        }

        scanner.close();
    
    }
    public static void perguntaDois() {

    }

    public static void jogar() {
        Scanner scanner = new Scanner(System.in);
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

                TimeUnit.MILLISECONDS.sleep(20);// deixar 20
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Quando, de repente...");

        try {

            TimeUnit.SECONDS.sleep(15); // deixar como 15 no teste final
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

            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String introducaoDois = "\n\n'Code' é sugado por um portal que se abre no monitor do seu computador. Ele acorda em um mundo de código em constante mutação. \n De longe ele percebe um painel com o nome : \n\n";

        for (char letra : introducaoDois.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15);// mudar para 15
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
                    TimeUnit.MILLISECONDS.sleep(0);// mudar para 10
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        String introducaoMentorVirtual = "\"Enquanto 'Code' olhava perplexo para aquele painel, pensando em como ele foi parar naquele lugar estranhamente familiar, um homem se aproximava no horizonte.\nEra um homem de estatura baixa, careca e com uma barba mal feita, vestindo um sobretudo marrom e óculos 'tecnológicos'.\nEle se aproximou de 'Code' apresentando-se como: 'O Mentor Virtual'\n";

        for (char letra : introducaoMentorVirtual.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15);// mudar para 15
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String dialogo = "\nMentor Virtual: \"Bem-vindo, Code. Você foi escolhido para salvar CodeLand. Este mundo está em perigo devido ao NebulaShadow, que corrompeu nosso código, deixando nossa cidade toda em um caos total. Para restaurar a ordem, você deve enfrentar vários desafios envolvendo todo o seu conhecimento em programação, mais especificamente, você terá que usar o nosso queridinho 'JAVA'.\n"
                +
                "\nCode: 'Tinha que ser logo Java? A linguagem de programação que eu mais tenho dificuldade!'\n" +
                "\nMentor Virtual: 'Não se preocupe! Eu estou aqui justamente para te auxiliar no começo para que você consiga derrotar o chefão.\nVou te mostrar o básico por agora!";

        for (char letra : dialogo.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15); // deixar 15
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int escolha = 0;
        while (true) {
            System.out.println("\nVocê está pronto?\n\n1 - Claro!\n2 - Estou com um pouco de Medo.\n");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Que maravilha! Esse é o espírito de um verdadeiro Herói.\n Agora vamos lá!");
                break;
            } else if (escolha == 2) {
                System.out.println(
                        "Code, o escolhido! Não tema, pois será você quem trará a vitória para o nosso povo. Vamos lá para a cidade que eu lhe mostrarei o caminho.");
                break;
            } else {
                System.out.println("Por favor, escolha uma opção válida (1 ou 2)!");
            }
        }

        String primeirosPassos = "\nCode adentra naquela cidade futurista e claramente abandonada, um ambiente de desenvolvimento digital com códigos flutuando no ar e estruturas de dados animadas. Para uma pessoa comum, aquilo seria bizarro, mas para um programador, principalmente para 'Code', aquilo era Fantástico!\n"
                + //
                "O Mentor Virtual pede para Code parar um momento para que ele possa ensinar o básico dos fundamentos daquele mundo.\"\n";

        for (char letra : primeirosPassos.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(15); // deixar 15
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String primeiroConfronto = "\nApós os dois pararem, Code sente a presença de algo saindo de trás de um prédio gigantesco que estava ao seu lado...\n";

        for (char letra : primeiroConfronto.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(30); // deixar 30
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        String primeiroConfrontoDois = "Era uma criatura gigante de metal.\nEla tinha vários braços, talvez uns 8, uma cabeça quadrada e um olho particularmente sinistro no centro.\nEsse monstro começou a olhar lentamente em direção a Code...";

        for (char letra : primeiroConfrontoDois.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(100); // deixar 100
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String primeiroConfrontoTres = "Mentor Virtual, vendo o desespero nos olhos de Code, grita: \"Code! Esse monstro é um dos bugs que o NebulaShadow soltou pela cidade! Derrote-o e prove seu valor! Mas lembre-se, você precisa usar seus conhecimentos em Java!\"'";

        for (char letra : primeiroConfrontoTres.toCharArray()) {
            System.out.print(letra);
            try {

                TimeUnit.MILLISECONDS.sleep(30); // deixar 30
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            System.out.println("\nO que você vai fazer ?\n\n1 - Lutar!\n2 - Fugir!.\n");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                perguntaUm();
                break;
            } else if (escolha == 2) {
                System.out.println(
                        "Code, para de ser covarde! A cidade precisa de você para acabar com o chefão!");
                        perguntaUm();
                break;
            } else {
                System.out.println("Por favor, escolha uma opção válida (1 ou 2)!");
            }
        }

        scanner.close();
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
