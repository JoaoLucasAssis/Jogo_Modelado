 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    public int vidaPersonagem = 250;
    
    GifImage myGif = new GifImage("boneco paradin.gif");
    
    Projetil projetil;
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            projetil.disparar();
        }
        if(vidaPersonagem == 0){
        Greenfoot.stop();
        }
        setImage( myGif.getCurrentImage() );
        GreenfootImage image = getImage();
        image.scale(110, 110);
        
        if (Greenfoot.isKeyDown("a")){
            setRotation(180);
            move(3);
            turn(360);
        }
        if (Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(3);
            turn(0);
        }if (Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(3);
            turn(0);
        }
        if (Greenfoot.isKeyDown("w")){
            setRotation(270);
            move(3);
            turn(360);
        }
        
        Actor Zumbi;
        Zumbi = getOneObjectAtOffset(0, 0, Zumbi_Normal.class);
        if(Zumbi != null) {
            vidaPersonagem--; 
        }
    }
}
