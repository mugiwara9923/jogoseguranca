package jogoseguranca;

public class Personagem {
    private int posX;
    private int posY;
    private int velocidade;

    public Personagem(int posX, int posY, int velocidade) {
        this.posX = posX;
        this.posY = posY;
        this.velocidade = velocidade;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void moverParaCima() {
        posY -= velocidade;
    }

    public void moverParaBaixo() {
        posY += velocidade;
    }

    public void moverParaEsquerda() {
        posX -= velocidade;
    }

    public void moverParaDireita() {
        posX += velocidade;
    }

    public void exibirPosicao() {
        System.out.println("Posição do personagem: (" + posX + ", " + posY + ")");
    }
}
