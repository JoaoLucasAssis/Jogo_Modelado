
import java.util.Random;
import javax.swing.ImageIcon;


public class Mago extends Terrestre {

    @Override
    void desenhar() {
        icon = new ImageIcon("mago.png");
    }

    @Override
    void falar() {
        System.out.println("Falar(Mago)");
    }

    @Override
    int correr() {
        Random r = new Random();
        return r.nextInt(21);
    }
}
