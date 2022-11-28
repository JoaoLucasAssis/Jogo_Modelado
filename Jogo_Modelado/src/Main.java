
import java.util.Random;
import java.util.Scanner;


public class Main {

    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    
    static int o = 0, i = 1, opcao, opcaoMenu;
    
    public static Personagem escolherPersonagem() {
        
        o = r.nextInt(5);
        
        Personagem personagem = null;
        
        switch(o) {
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
            o = r.nextInt(2);
        if(personagem.getClass() == Soldado.class)
            o = r.nextInt(3);
        if(personagem.getClass() == General.class)
            o = r.nextInt(4);
        if(personagem.getClass() == Mago.class)
            o = 5;
        if(personagem.getClass() == Dragao.class)
            o = 4;
        
        Arma_IF arma = null;
        
        switch(o) {
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
    
    public static int combate(Personagem p1, Arma_IF a1, Personagem p2, Arma_IF a2) {
        
        //Apresentando os personagens e suas armas
        System.out.println("Personagem 1\n\nClasse: "+p1.getClass()+"\nVidas: "+p1.vidas+"\nArma: "+a1.getClass()+"\nAtaque: "+a1.ataque+"\n\n");
        System.out.println("Personagem 2\n\nClasse: "+p2.getClass()+"\nVidas: "+p2.vidas+"\nArma: "+a2.getClass()+"\nAtaque: "+a2.ataque+"\n\n");

        i = 1;
        do {
            System.out.println("-=-Rodada do personagem "+i+"-=-\n[0]correr [1]atacar");
            opcao = s.nextInt(); //try{} catch(){}
            if(i == 1) {
                switch (opcao) {
                    case 0 -> {
                        //p1.correr();
                    }
                    case 1 -> {
                        p1.usarArma();
                        p2.vidas -= a1.ataque;
                        System.out.println("Vida do personagem 2: "+p2.vidas+"\n");
                    }
                    default -> {
                        //throw new algumaExcecao
                    }
                }
                i++;
            }
            else if(i == 2) {
                switch (opcao) {
                    case 0 -> {
                        //p2.correr();
                    }
                    case 1 -> {
                        p2.usarArma();
                        p1.vidas -= a2.ataque;
                        System.out.println("Vida do personagem 1: "+p1.vidas+"\n");
                    }
                    default -> {
                        //throw new algumaExcecao
                    }
                }
                i = 1;
            }
        } while(p1.vidas > 0 && p2.vidas > 0);
        
        if(p1.vidas <= 0)
            System.out.println("Vitoria do personagem 2");
        else if(p2.vidas <= 0)
            System.out.println("Vitoria do personagem 1");
        return 0;
    }
    
    public static void main(String[] args) {
        
        do {
            Personagem p1 = escolherPersonagem();
            Personagem p2 = escolherPersonagem();
            
            Arma_IF a1 = escolherArma(p1);
            Arma_IF a2 = escolherArma(p2);

            p1.setArma(a1);
            p2.setArma(a2);

            combate(p1, a1, p2, a2);
            
            System.out.println("\nQuer jogar novamente?\n[1]SIM [Qualquer tecla]NAO\n");
            opcaoMenu = s.nextInt(); //try{} catch(){}
            
        } while(opcaoMenu == 1);
    }
}
