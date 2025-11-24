public class Main {
    public static void main(String[] args) {

        Questao questao1 = new Questao();

        questao1.pergunta = "Quando o Brasil ganhou a sua terceira copa do mundo?";
        questao1.opcaoA = "A) 1982";
        questao1.opcaoB = "B) 1970";
        questao1.opcaoC = "C) 1962";
        questao1.opcaoD = "D) 1958";
        questao1.opcaoE = "E) 2002";
        questao1.correta = "B";

        questao1.escrevaQuestao();

        String resposta = questao1.leiaResposta();

        questao1.isCorreta(resposta);
    }
}
