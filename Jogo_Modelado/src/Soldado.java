
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
    void correr() {
        System.out.println("Correr(Soldado)");
    }
    
}
