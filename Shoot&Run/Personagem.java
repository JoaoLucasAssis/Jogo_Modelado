 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    int vidaPersonagem = 150;
    int score = 0;
    GifImage myGif = new GifImage("boneco paradin.gif");
    
    
    public void act()
    {
        escalaPersonagem();
        mover();
        girar();
        atirar();
        dano();
    }
    public void girar()
    {
      if(Greenfoot.getMouseInfo() !=null)  
      turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());  
    }
    public void mover() {
        if(Greenfoot.isKeyDown("w"))
      {
         setLocation(getX(),getY() - 3); 
        }
      if(Greenfoot.isKeyDown("a"))
      {
         setLocation(getX() -3 ,getY()); 
        }
      if(Greenfoot.isKeyDown("s"))
      {
         setLocation(getX() ,getY() + 3);
        }
      if(Greenfoot.isKeyDown("d"))
      {
        setLocation(getX() + 3 ,getY());  
        } 
    }
    public void atirar() {
        if(Greenfoot.mousePressed(null)){
            Projetil p = new Projetil();
            getWorld().addObject(p, getX() + 28, getY());
            p.setRotation(getRotation());
            p.move(50);
            somtiro();
        }
    }
    public void dano() {
        Actor Zumbi;
        Zumbi = getOneObjectAtOffset(0, 0, Zumbi_Normal.class);
        if(Zumbi != null) {
            vidaPersonagem--; 
        }
        if(vidaPersonagem <= 0){
        Greenfoot.stop();
        }    
    }
    public void escalaPersonagem() {
        setImage( myGif.getCurrentImage() );
        GreenfootImage image = getImage();
        image.scale(110, 110);
    }
    public void somtiro(){
        Greenfoot.playSound("tirosom.mp3");
    }
    
}
