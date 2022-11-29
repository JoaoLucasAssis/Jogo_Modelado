
import java.util.Random;
import javax.swing.ImageIcon;

public class Soldado extends Terrestre{

    @Override
    void desenhar() {
        icon = new ImageIcon("soldado.png");
    }

    @Override
    void falar() {
        System.out.println("Falar(Soldado)");
    }

    @Override
    int correr() {
        Random r = new Random();
        return r.nextInt(21);
    }
    
}
