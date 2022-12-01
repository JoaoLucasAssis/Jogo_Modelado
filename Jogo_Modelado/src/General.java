
import java.util.Random;
import javax.swing.ImageIcon;


public class General extends Terrestre{

    @Override
    void desenhar() {
        icon = new ImageIcon("general.png");    
    }

    @Override
    void falar() {
        System.out.println("Falar(General)");  
    }
    
    @Override
    int correr() {
        Random r = new Random();
        return r.nextInt(21);
    }
}
