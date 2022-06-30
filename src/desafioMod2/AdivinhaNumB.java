package desafioMod2;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumB {

    public static void main(String[] args) {

//variaveis que vão compor controles
        int rangerMin = 1;
        int rangerMax = 4;
        boolean validaRanger = true;
        boolean validaQuase = true;
        int contaVezes = 3;
        String continuar = "Sim";
        //int somaPontos = pontuacao;
        //int contador = 0;
        //int checagem = maquina;


        Random numerario = new Random();
            int maquina = numerario.nextInt(4)+1;

        Scanner lancaNum = new Scanner(System.in);


   //do {
            System.out.println("Vamos ver se você é bom de adivinhação!\nQual número de 1 a 4, minha lógica computacional está pensando? ");
            int sorte = lancaNum.nextInt();


//logica para validar pontuação
       if (sorte < rangerMin || sorte > rangerMax) {
           System.out.println("Número inválido, vamos tentar novamente. Escolha um número de " + rangerMin + " a " + rangerMax);
           // implementar uma funçao que retorne para executar novamente int sorte = lancaNum.nextInt();

       } else {
           System.out.println("Você digitou " + sorte + ". Então deixa minha RAM verificar...");

           if (sorte == maquina) {
               System.out.println("Parece que encontrei alguém para me desafiar.\nParabéns, você acertou.\nVocê ganhou 10 pontos");
               //System.out.println("Opa! Aceita ser desafiado para uma nova rodada, Sim ou Não?");
               //implemntar aqui um acumulador de pontos pontuacao=pontuacao+10 de cada rodada; até desistir do desafio;

           } else if (sorte == maquina + 1 || sorte == maquina -1) {
               System.out.println("Olha, passei vexame aqui. Bateu na trave! Você ganhou 5 pontos, e mais uma chance");
                    //aqui quase acertou, recebe 5 pontos; contador de vezes que era 3, cai para 2; usuario tenta novamente
                    // se errar, fim de encerrado, sai com 5 pontos apenas; o numero que jogou é mostrado, numero da maquina é mostrado,
                    // se quase acertar, recebe mais 5 pontos acumulando 10 pontos; contador de vezes era 2 cai para u1; usuario tenta novamente
                    // se errar, fim de encerrado, sai com 10 pontos apenas; os numeros que jogou são mostrado, numero da maquina é mostrado,
                    // se acertar, recebe mais 10 pontos acumulando 10 pontos; contador de vezes era 2 cai para u1; usuario tenta novamente

               // desafiado a jogar nova rodada (joga sim ou joga não?)

               // implementar um loopin de 3 vezes; APÓS 3 tentativas, encerra o programa
               //implemntar aqui um acumulador de pontos pontuacao=pontuacao+10; ou sai com total 5 pontos, com 10 ou com 20 pontos
               //cada tentativa ser armazenada (valor que lançou, certo e errado também); array para certos; array para errados;
               //System.out.println("Opa! Aceita ser desafiado para uma nova rodada, Sim ou Não?"); após sair das 3 tentativas


           } else {
               System.out.println("GigaBytes!! Minha IA venceu e você não pontua nessa rodada.");


               //System.out.println("Opa! Aceita ser desafiado para uma nova rodada, Sim ou Não?");
           }
       }

       //o que será apresentado na tela
       System.out.println("o numero gerado na maquina foi: "+maquina);
       System.out.println();

   //}while (validaRanger);



    }

}
