
public class Main {
    public static void main(String[] args) {
        Soldado soldado = new Soldado();
        soldado.desenhar();
        
        Revolver revolver = new Revolver();
        
        soldado.setArma(revolver);
        soldado.usarArma();
    }
}
