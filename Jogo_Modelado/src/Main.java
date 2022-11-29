
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    static Random r = new Random();
    
    static int opcao = 0, opcaoValida = 0, i = 1;
    static String msg;

    //Mensagens
    public static void MsgDeInformacao(String cabecalho, Icon icon){
	JOptionPane.showMessageDialog(null, null, cabecalho, JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
    public static void MsgDeErro(String cabecalho, String frase) {
	JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
    }

    public static Personagem escolherPersonagem() {
        
        opcao = r.nextInt(5);
        
        Personagem personagem = null;
        
        switch(opcao) {
            case 0 -> {
                Lutador lutador = new Lutador();
                lutador.vidas = r.nextInt(21) + 30;
                personagem = lutador;
            }
            case 1 -> {
                Soldado soldado = new Soldado();
                soldado.vidas = r.nextInt(31) + 30;
                personagem = soldado;
            }
            case 2 -> {
                General general = new General();
                general.vidas = r.nextInt(21) + 40;
                personagem = general;
            }
            case 3 -> {
                Mago mago = new Mago();
                mago.vidas = r.nextInt(21) + 60;
                personagem = mago;
            }
            case 4 -> {
                Dragao dragao = new Dragao();
                dragao.vidas = r.nextInt(21) + 80;
                personagem = dragao;
            }
        }
        return personagem;
    }
    
    public static Arma_IF escolherArma(Personagem personagem) {
        
        if(personagem.getClass() == Lutador.class)
            opcao = r.nextInt(2);
        if(personagem.getClass() == Soldado.class)
            opcao = r.nextInt(3);
        if(personagem.getClass() == General.class)
            opcao = r.nextInt(4);
        if(personagem.getClass() == Mago.class)
            opcao = 5;
        if(personagem.getClass() == Dragao.class)
            opcao = 4;
        
        Arma_IF arma = null;
        
        switch(opcao) {
            case 0 -> {
                Desarmado desarmado = new Desarmado();
                desarmado.ataque = 10;
                arma = desarmado;
            }
            case 1 -> {
                Faca faca = new Faca();
                faca.ataque = 15;
                arma = faca;
            }
            case 2 -> {
                Revolver revolver = new Revolver();
                revolver.ataque = 20;
                arma = revolver;
            }
            case 3 -> {
                Fuzil fuzil = new Fuzil();
                fuzil.ataque = 30;
                arma = fuzil;
            }
            case 4 -> {
                Fogo fogo = new Fogo();
                fogo.ataque = 35;
                arma = fogo;
            }
            case 5 -> {
                Magia magia = new Magia();
                magia.ataque = 40;
                arma = magia;
            }   
        }
        return arma;
    }
    
    public static void atacar(Personagem personagem) {
        personagem.desenhar();
        msg = personagem.usarArma();
        MsgDeInformacao(msg, personagem.icon);
    }
    
    public static int opcaoCombateValida() {
        do {
            opcaoValida = 0;
            try {
                msg = JOptionPane.showInputDialog (null, "[0]correr [1]atacar", "Rodada do personagem "+i, JOptionPane.QUESTION_MESSAGE);
                opcao = Integer.parseInt(msg);
                if(opcao != 1 && opcao != 0)
                    throw new Exception();
                else
                    opcaoValida = 1;
            } catch(Exception e) {
                MsgDeErro("Opcao invalida", "[0]correr [1]atacar");
                opcaoValida = 0;
            }
        } while(opcaoValida == 0);
        return opcao;
    }
    
    public static int opcaoMenuValida() {
        do {
            opcaoValida = 0;
            try {
                msg = JOptionPane.showInputDialog (null, "[1]SIM [0]NAO", "Jogar novamente?", JOptionPane.QUESTION_MESSAGE);
                opcao = Integer.parseInt(msg);
                if(opcao != 1 && opcao != 0)
                    throw new Exception();
                else
                    opcaoValida = 1;
            } catch(Exception e) {
                MsgDeErro("Opcao invalida", "[1]SIM [0]NAO");
                opcaoValida = 0;
            }
        } while(opcaoValida == 0);
        return opcao;
    }
    
    public static int combate(Personagem p1, Arma_IF a1, Personagem p2, Arma_IF a2) {
        
        Icon coracao = new ImageIcon("coracao.png");
        Icon trofeu = new ImageIcon("trofeu.png");
        int opcaoCombate;
        
        i = 1;
        
        do {
            opcaoCombate = opcaoCombateValida();
            if(i == 1) { 
                switch (opcaoCombate) {
                    case 0 -> {
                        //p1.correr();
                }
                    case 1 -> {
                        atacar(p1);
                        p2.vidas -= a1.ataque;
                        MsgDeInformacao("Vida do personagem 2: "+p2.vidas, coracao);
                    }
                }
                i++;
            }
            else if(i == 2) {
                switch (opcaoCombate) {
                    case 0 -> {
                        //p2.correr();
                    }
                    case 1 -> {
                        atacar(p2);
                        p1.vidas -= a2.ataque;
                        MsgDeInformacao("Vida do personagem 1: "+p1.vidas, coracao);
                    }
                }
                i = 1;
            }
        } while(p1.vidas > 0 && p2.vidas > 0);
        
        if(p1.vidas <= 0)
            MsgDeInformacao("Vitoria do personagem 2", trofeu);
        else if(p2.vidas <= 0)
            MsgDeInformacao("Vitoria do personagem 1", trofeu);
        return 0;
    }
    
    public static void main(String[] args) {
        int opcaoMenu;
        do {
            Personagem p1 = escolherPersonagem();
            Personagem p2 = escolherPersonagem();
            
            Arma_IF a1 = escolherArma(p1);
            Arma_IF a2 = escolherArma(p2);

            p1.setArma(a1);
            p2.setArma(a2);

            combate(p1, a1, p2, a2);
            
            opcaoMenu = opcaoMenuValida();
            
        } while(opcaoMenu == 1);
    }
}
