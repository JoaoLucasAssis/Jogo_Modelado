
public class Dragao extends Personagem implements Aereo {

    @Override
    void desenhar() {
        System.out.println("Desenhar(Dragao)");
    }

    @Override
    public void voar() {
        System.out.println("Voar(Dragao)");
    }
    
}
