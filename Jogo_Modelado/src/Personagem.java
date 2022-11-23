
public abstract class Personagem {
    
    Arma_IF arma;
    
    abstract void desenhar();
    
    abstract void falar();
    
    public void usarArma() {
        arma.usarArma();
    }
    
    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }
}
