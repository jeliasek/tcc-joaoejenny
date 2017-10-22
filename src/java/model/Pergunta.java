package model;

public class Pergunta {

    private int pk_pergunta;
    private int pk_resposta;
    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;

    public Pergunta(int pk_pergunta, int pk_resposta, String pergunta, String respostaA, String respostaB, String respostaC) {
        this.pk_pergunta = pk_pergunta;
        this.pk_resposta = pk_resposta;
        this.pergunta = pergunta;
        this.respostaA = respostaA;
        this.respostaB = respostaB;
        this.respostaC = respostaC;
    }

    public Pergunta() {
    }

    @Override
    public String toString() {
        return "Pergunta{" + "pk_pergunta=" + pk_pergunta + ", pk_resposta=" + pk_resposta + ", pergunta=" + pergunta + ", respostaA=" + respostaA + ", respostaB=" + respostaB + ", respostaC=" + respostaC + '}';
    }

    public int getPk_pergunta() {
        return pk_pergunta;
    }

    public void setPk_pergunta(int pk_pergunta) {
        this.pk_pergunta = pk_pergunta;
    }

    public int getPk_resposta() {
        return pk_resposta;
    }

    public void setPk_resposta(int pk_resposta) {
        this.pk_resposta = pk_resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

}
