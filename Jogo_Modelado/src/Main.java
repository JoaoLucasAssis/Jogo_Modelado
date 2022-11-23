
public class Main {
    public static void main(String[] args) {
        
        //instanciando os personagens 
        Soldado soldado = new Soldado();
        General general = new General();
        Lutador lutador = new Lutador();
        Mago mago = new Mago();
        Dragao dragao = new Dragao();
        
        //instanciando as armas
        Desarmado desarmado = new Desarmado();
        Faca faca = new Faca();
        Fogo fogo = new Fogo();
        Fuzil fuzil = new Fuzil();
        Revolver revolver = new Revolver();
        
        //atribuindo armas aos personagens
        soldado.setArma(revolver);
        general.setArma(fuzil);
        lutador.setArma(desarmado);
        mago.setArma(fogo);
        dragao.setArma(fogo);
    }
}
