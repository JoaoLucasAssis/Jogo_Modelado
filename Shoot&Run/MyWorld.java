import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("fundosom.mp3");
    public Personagem personagem;
    public Zumbi_Normal zumbi_Normal;
    int count = 0;

    public MyWorld()
    {    
        super(1020, 800, 1);
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(35);
        prepare();
    }
    public void act() {
        count++;
       int r = Greenfoot.getRandomNumber(8);
        if(count % 50 == 0)
        {
          switch(r){
           case 0 : addObject(new Zumbi_Normal(), 0, 0);break;
           case 1 :addObject(new Zumbi_Normal(),getWidth()/2,0);break;
           case 2 :addObject(new Zumbi_Normal(),getWidth(), 0);break;
           case 3 :addObject(new Zumbi_Normal(),0,getHeight()/2);break;
           case 4 :addObject(new Zumbi_Normal(),getWidth(),getHeight()/2);break;
           case 5 :addObject(new Zumbi_Normal(),0,getHeight());break;
           case 6 :addObject(new Zumbi_Normal(),getWidth()/2,getHeight());break;
          case 7 :addObject(new Zumbi_Normal(),getWidth(),getHeight());break;
            }
        }
    }
    private void prepare()
    {
        personagem = new Personagem();
        addObject(personagem,499,406);

        zumbi_Normal = new Zumbi_Normal();
        addObject(zumbi_Normal,688,390);
        
        Temporizador temporizador = new Temporizador();
        addObject(temporizador,502,110);

        MostrarVida mostrarvida = new MostrarVida();
        addObject(mostrarvida, 140,655);
        
        MostrarScore score = new MostrarScore();
        addObject(score, 102, 110);
    }
}

  