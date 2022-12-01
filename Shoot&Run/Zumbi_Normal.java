import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Zumbi_Normal extends Actor
{
    public int vidaZumbi = 2;
    
    GifImage myGif = new GifImage("Zumbi.gif");
    
    public void andar(){
        turnTowards(getWorldOfType(MyWorld.class).personagem.getX(), getWorldOfType(MyWorld.class).personagem.getY());
        move(1);
    }
    public void imagemZumbi() {
        setImage( myGif.getCurrentImage() );
        GreenfootImage image = getImage();
        image.scale(120, 120);
    }
    public void act()
    {
        imagemZumbi();
        andar();
        dano();
    }
    public void dano() {
      Actor projetil = getOneIntersectingObject(Projetil.class);
      if(projetil != null) {
         vidaZumbi--;
         getWorld().removeObject(projetil);
        }
        if(vidaZumbi <= 0) {
            getWorldOfType(MyWorld.class).personagem.score++;
          getWorld().removeObject(this);  
        }
    }
}
