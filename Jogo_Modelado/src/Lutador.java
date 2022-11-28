
import java.util.Random;


public class Lutador extends Terrestre{

    @Override
    void desenhar() {
        System.out.println("Desenhar(Lutador)");
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
