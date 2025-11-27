public class Main {
    public static void main(String[] args) {

        System.out.println("Quiz de Futebol");
        System.out.println("Aluno: Matheus da Silva Morais");
        System.out.println("Faculdade Alfredo Nasser - Unifan");
        System.out.println("---------------------------------------");

        int pontos = 0;
        Questao questao1 = new Questao();

        questao1.pergunta = "Quando o Brasil ganhou a sua terceira copa do mundo?";
        questao1.opcaoA = "A) 1982";
        questao1.opcaoB = "B) 1970";
        questao1.opcaoC = "C) 1962";
        questao1.opcaoD = "D) 1958";
        questao1.opcaoE = "E) 2002";
        questao1.correta = "B";

        questao1.escrevaQuestao();

        String resposta1 = questao1.leiaResposta();

        if (questao1.isCorreta(resposta1)) pontos++;



        Questao questao2 = new Questao();

        questao2.pergunta = "Quantas Bolas de ouro Lionel Messi tem?";
        questao2.opcaoA = "A) 4";
        questao2.opcaoB = "B) 6";
        questao2.opcaoC = "C) 7";
        questao2.opcaoD = "D) 8";
        questao2.opcaoE = "E) 10";
        questao2.correta = "D";

        questao2.escrevaQuestao();

        String resposta2 = questao2.leiaResposta();

        if (questao2.isCorreta(resposta2)) pontos++;



        Questao questao3 = new Questao();

        questao3.pergunta = "Em que ano o neymar ganhou a sua única Champions League?";
        questao3.opcaoA = "A) 2012";
        questao3.opcaoB = "B) 2017";
        questao3.opcaoC = "C) 2015";
        questao3.opcaoD = "D) 2014";
        questao3.opcaoE = "E) 2020";
        questao3.correta = "C";

        questao3.escrevaQuestao();

        String resposta3 = questao3.leiaResposta();

        if (questao3.isCorreta(resposta3)) pontos++;



        Questao questao4 = new Questao();

        questao4.pergunta = "Qual o time com mais títulos de Brasileirão série A?";
        questao4.opcaoA = "A) Palmeiras";
        questao4.opcaoB = "B) Flamengo";
        questao4.opcaoC = "C) Corinthians";
        questao4.opcaoD = "D) Santos";
        questao4.opcaoE = "E) São Paulo";
        questao4.correta = "A";

        questao4.escrevaQuestao();

        String resposta4 = questao4.leiaResposta();

        if (questao4.isCorreta(resposta4)) pontos++;



        Questao questao5 = new Questao();

        questao5.pergunta = "Qual o Time Brasileirão com mais títulos do Mundial de Clubes?";
        questao5.opcaoA = "A) Flamengo";
        questao5.opcaoB = "B) Santos";
        questao5.opcaoC = "C) São Paulo";
        questao5.opcaoD = "D) Vasco";
        questao5.opcaoE = "E) Fluminense";
        questao5.correta = "C";

        questao5.escrevaQuestao();

        String resposta5 = questao5.leiaResposta();

        if (questao5.isCorreta(resposta5)) pontos++;


        Questao questao6 = new Questao();

        questao6.pergunta = "Quem foi o campeão da copa do mundo de 2010?";
        questao6.opcaoA = "A) Brasil";
        questao6.opcaoB = "B) Alemanha";
        questao6.opcaoC = "C) Argentina";
        questao6.opcaoD = "D) França";
        questao6.opcaoE = "E) Espanha";
        questao6.correta = "E";

        questao6.escrevaQuestao();

        String resposta6 = questao6.leiaResposta();

        if (questao6.isCorreta(resposta6)) pontos++;



        Questao questao7 = new Questao();

        questao7.pergunta = "Quem foi o artilheiro da copa do mundo de 2022?";
        questao7.opcaoA = "A) Harry Kane";
        questao7.opcaoB = "B) Mbappe";
        questao7.opcaoC = "C) Messi";
        questao7.opcaoD = "D) Neymar";
        questao7.opcaoE = "E) Lautaro Martinez";
        questao7.correta = "B";

        questao7.escrevaQuestao();

        String resposta7 = questao7.leiaResposta();

        if (questao7.isCorreta(resposta7)) pontos++;



        Questao questao8 = new Questao();

        questao8.pergunta = "Qual país foi campeão da Eurocopa 2016?";
        questao8.opcaoA = "A) Portugal";
        questao8.opcaoB = "B) França";
        questao8.opcaoC = "C) Alemanha";
        questao8.opcaoD = "D) Itália";
        questao8.opcaoE = "E) Albânia";
        questao8.correta = "A";

        questao8.escrevaQuestao();

        String resposta8 = questao8.leiaResposta();

        if (questao8.isCorreta(resposta8)) pontos++;



        Questao questao9 = new Questao();

        questao9.pergunta = "Quem é o jogador com mais gols oficiais pela FIFA?";
        questao9.opcaoA = "A) Pelé";
        questao9.opcaoB = "B) Lionel Messi";
        questao9.opcaoC = "C) Frerenc Puskás";
        questao9.opcaoD = "D) Cristiano Ronaldo";
        questao9.opcaoE = "E) Romário";
        questao9.correta = "D";

        questao9.escrevaQuestao();

        String resposta9 = questao9.leiaResposta();

        if (questao9.isCorreta(resposta9)) pontos++;
        questao9.isCorreta(resposta9); pontos++;


        Questao questao10 = new Questao();

        questao10.pergunta = "Qual time foi o campeão da Champions League 2024-25?";
        questao10.opcaoA = "A) PSG";
        questao10.opcaoB = "B) Barcelona";
        questao10.opcaoC = "C) Real Madrid";
        questao10.opcaoD = "D) Milan";
        questao10.opcaoE = "E) Inter de Milão";
        questao10.correta = "A";

        questao10.escrevaQuestao();

        String resposta10 = questao10.leiaResposta();

        if (questao10.isCorreta(resposta10)) pontos++;



        Questao questao11 = new Questao();

        questao11.pergunta = "Quem foi o campeão da bola de ouro de 2022?";
        questao11.opcaoA = "A) Lionel Messi";
        questao11.opcaoB = "B) Harry Kane";
        questao11.opcaoC = "C) Cristiano Ronaldo";
        questao11.opcaoD = "D) Mbappe";
        questao11.opcaoE = "E) Haaland";
        questao11.correta = "C";

        questao11.escrevaQuestao();

        String resposta11 = questao11.leiaResposta();

        if (questao11.isCorreta(resposta11)) pontos++;



        Questao questao12 = new Questao();

        questao12.pergunta = "Quem ganhou a copa Libertadores em 2021?";
        questao12.opcaoA = "A) Flamengo";
        questao12.opcaoB = "B) Santos";
        questao12.opcaoC = "C) Palmeiras";
        questao12.opcaoD = "D) Vasco";
        questao12.opcaoE = "E) Fluminense";
        questao12.correta = "C";

        questao12.escrevaQuestao();

        String resposta12 = questao12.leiaResposta();

        if (questao12.isCorreta(resposta12)) pontos++;


        Questao questao13 = new Questao();

        questao13.pergunta = "Quem é o maior campeão da Champions League?";
        questao13.opcaoA = "A) Real Madrid";
        questao13.opcaoB = "B) Milan";
        questao13.opcaoC = "C) Barcelona";
        questao13.opcaoD = "D) Bayern de Munique";
        questao13.opcaoE = "E) Liverpool";
        questao13.correta = "A";

        questao13.escrevaQuestao();

        String resposta13 = questao13.leiaResposta();

        if (questao13.isCorreta(resposta13)) pontos++;



        Questao questao14 = new Questao();

        questao14.pergunta = "Qual o Time com mais títulos da Premier League?";
        questao14.opcaoA = "A) Manchester City";
        questao14.opcaoB = "B) Liverpool";
        questao14.opcaoC = "C) Arsenal";
        questao14.opcaoD = "D) Manchester United";
        questao14.opcaoE = "E) Chelsea";
        questao14.correta = "D";

        questao14.escrevaQuestao();

        String resposta14 = questao14.leiaResposta();

        if (questao14.isCorreta(resposta14)) pontos++;



        Questao questao15 = new Questao();

        questao15.pergunta = "Quem foi campeão da copa libertadores de 2024?";
        questao15.opcaoA = "A) Flamengo";
        questao15.opcaoB = "B) Santos";
        questao15.opcaoC = "C) São Paulo";
        questao15.opcaoD = "D) Botafogo";
        questao15.opcaoE = "E) Fluminense";
        questao15.correta = "D";

        questao15.escrevaQuestao();

        String resposta15 = questao15.leiaResposta();

        if (questao15.isCorreta(resposta15)) pontos++;


        System.out.println("Parabéns, sua pontuação foi "+ pontos + " de 15 possíveis");

    }
}
