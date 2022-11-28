
import java.util.Random;


public class Mago extends Terrestre {

    @Override
    void desenhar() {
        System.out.println("Desenhar(Mago)");
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
