
import java.util.Random;


public class Soldado extends Terrestre{

    @Override
    void desenhar() {
        System.out.println("Desenhar(Soldado)");
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
