
import java.util.Random;


public class General extends Terrestre{

    @Override
    void desenhar() {
        System.out.println("Desenhar(General)");    
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
