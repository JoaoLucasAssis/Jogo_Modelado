
import javax.swing.ImageIcon;


public class Dragao extends Personagem implements Aereo {

    @Override
    void desenhar() {
        icon = new ImageIcon("dragao.png");
    }

    @Override
    public void voar() {
        System.out.println("Voar(Dragao)");
    }
    
}
