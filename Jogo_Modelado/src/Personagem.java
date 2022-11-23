
public abstract class Personagem {
    
    Arma_IF arma;
    
    abstract void desenhar();
    
    public void usarArma() {
        arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        //try {} catch(){} 
        //Alguns personagens não podem usar algumas armas
        this.arma = arma;
    }
}
