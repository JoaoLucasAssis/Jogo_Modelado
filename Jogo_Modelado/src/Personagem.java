
public abstract class Personagem {
    
    Arma_IF arma;

    int vidas;

    abstract void desenhar();
    
    void usarArma() {
        arma.usarArma();
    }

    void setArma(Arma_IF arma) {
        this.arma = arma;
    }
}
