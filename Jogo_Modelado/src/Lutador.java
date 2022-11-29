
import java.util.Random;
import javax.swing.ImageIcon;


public class Lutador extends Terrestre{

    @Override
    void desenhar() {
        icon = new ImageIcon("lutador.png");
    }

    @Override
    void falar() {
        System.out.println("Falar(Lutador)");
    }

    @Override
    int correr() {
        Random r = new Random();
        return r.nextInt(21);
    }
}
