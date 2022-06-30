package desafioMod2;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumA {

    public static void main(String[] args) {

//variaveis que vão compor controles
        int rangerMin = 1;
        int rangerMax = 4;

        Random numerario = new Random();


            int maquina = numerario.nextInt(rangerMax)+1;

        Scanner lancaNum = new Scanner(System.in);
            System.out.println("Vamos ver se você é bom de adivinhação!\nQual número de "+rangerMin+" a "+rangerMax+", a minha lógica computacional está pensando? ");

            int sorte = lancaNum.nextInt();
            lancaNum.close();


//logica para validar pontuação
        if(sorte < rangerMin || sorte > rangerMax) {
            System.out.println("Número inválido. Por genteliza, reinicie o jogo e escolha um número de "+rangerMin+" a "+rangerMax);
            // implementar uma funçao que retorne para executar novamente int sorte = lancaNum.nextInt();

        }else {
            System.out.println("Você digitou "+sorte+". Então deixa eu te falar...");

            if (sorte == maquina) {
                System.out.println("Parece que encontrei alguém para me desafiar.\nParabéns, você acertou.\nVocê ganhou 10 pontos");
                //System.out.println("Opa! Aceita ser desafiado novamente? ");
                //implemntar aqui um acumulador de pontos pontuacao=pontuacao+10;

            }else if (sorte == maquina + 1) {
                System.out.println("Olha, passei vexame aqui. Quase, quase. Você ganha 5 pontos.");
                //implemntar aqui um acumulador de pontos pontuacao=pontuacao+10;

            }else if (sorte == maquina - 1) {
                System.out.println("Olha, passei vexame aqui. Quase, quase. Você ganha 5 pontos.");
                //implemntar aqui um acumulador de pontos pontuacao=pontuacao+10;

            }else {
                System.out.println("GigaBytes!! Minha IA venceu e você não pontua nessa rodada.");

            }
        }

//o que será apresentado na tela
        System.out.println("o numero gerado na máquina foi: "+maquina);

    }

}
