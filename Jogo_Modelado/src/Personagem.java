
import javax.swing.Icon;

public abstract class Personagem {
    
    Arma_IF arma;
    Icon icon;
    int vidas;

    abstract void desenhar();
    
    String usarArma() {
        String msg = arma.usarArma();
        return msg;
    }

    void setArma(Arma_IF arma) {
        this.arma = arma;
    }
}
