import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MostrarVida extends Actor
{
 
public void printvida()
{
    updateImage();
}
 
public void act()
{
    updateImage();
}
 
public void updateImage()
{
    setImage(new GreenfootImage("VIDAS RESTANTE: " + getWorldOfType(MyWorld.class).personagem.vidaPersonagem, 30, Color.WHITE, null));
}
}
