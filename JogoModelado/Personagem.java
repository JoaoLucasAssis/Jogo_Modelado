public abstract class Personagem {
    Arma_IF arma;
    public abstract void desenhar();
    public void arma(){
        arma.usarArma();
    }
    public abstract setArma(Arma_IF arma){}
}