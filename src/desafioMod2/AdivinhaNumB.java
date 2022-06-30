package desafioMod2;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumB {

    public static void main(String[] args) {

//variaveis que vão compor controles
        int rangerMin = 1;
        int rangerMax = 5;
        boolean validaRanger = true;
        int contaVezes = 1;
        int somaPontos = 0;
        int pontoAcertou = 10;
        int pontoQuase = 5;
        //int contaLoppins = 0;

        Random numerario = new Random();
        int maquina = numerario.nextInt(rangerMax) + 1;

        Scanner lancaNum = new Scanner(System.in);


        do {
            System.out.println("Vamos ver se você é bom de adivinhação!\nQual número de " + rangerMin + " a " + rangerMax + ", minha lógica computacional está pensando? ");
            int sorte = lancaNum.nextInt();


        //logica para validar pontuação
            if (sorte < rangerMin || sorte > rangerMax) {
                System.out.println("Número inválido, vamos tentar novamente. Escolha um número de " + rangerMin + " a " + rangerMax);

            } else {
                System.out.println("Você digitou " + sorte + ". Então deixa minha RAM verificar...");

                if (sorte == maquina) {
                    System.out.println("Alguém se aventura a me desafiar. Parabéns, você acertou.\nVocê ganhou " + pontoAcertou + " pontos");
                    somaPontos += pontoAcertou;

                } else if (sorte == maquina + 1 || sorte == maquina - 1) {
                    System.out.println("Tô surpeso, você bateu na trave! Você ganhou " + pontoQuase + " pontos, e mais uma chance");
                    somaPontos += pontoQuase;

                    for (int i = 0; i < contaVezes; i++) {
                        System.out.println("Vamos lá, essa rodada só vale " + pontoQuase + " pontos. Então, se o número anterior bateu na trave, qual número eu tenho? ");
                        sorte = lancaNum.nextInt();

                        if (sorte == maquina) {
                            System.out.println("Certamente evoluímos. Parabéns, você acertou.\nVocê ganhou " + pontoQuase + " pontos");
                            somaPontos += pontoQuase;

                        } else {
                            System.out.println("você perdeu a rodada");

                        }
                    }


                } else {
                    System.out.println("GigaBytes!! Minha IA venceu e você não pontua nessa rodada.");

                }

            }

        //o que será apresentado na tela
            System.out.println("o numero gerado na máquina foi: " + maquina);
            System.out.println();
            System.out.println("Para encerrar o jogo digite N");
                String respostaUser = lancaNum.next();

            if (respostaUser.equalsIgnoreCase("n")) {

                break;
            }


        } while (validaRanger);
        System.out.println();
        System.out.println("Obrigado pelo Desafio. Até o próximo!");
        System.out.println("Você terminou o desafio e atingiu o total de " + somaPontos + " pontos");

    }

}
