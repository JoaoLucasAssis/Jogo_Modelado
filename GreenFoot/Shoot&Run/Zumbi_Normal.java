import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zumbi_Normal extends Actor
{
    public int vidaZumbi = 50;
    GifImage myGif = new GifImage("Zumbi.gif");
    public void AndarTarget(){
        turnTowards(getWorldOfType(MyWorld.class).personagem.getX(), getWorldOfType(MyWorld.class).personagem.getY());
        move(1);
    }
    public void act()
    {
        setImage( myGif.getCurrentImage() );
        GreenfootImage image = getImage();
        image.scale(150, 100);
        
        turn(90);
        AndarTarget();
        
        Actor Projetil;
        Projetil = getOneObjectAtOffset(0, 0, Projetil.class);
        if(Projetil != null){
            vidaZumbi--;
        }
        if(vidaZumbi == 0) {
            setLocation(Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(300));
            vidaZumbi = 2;
        }
    }
}
