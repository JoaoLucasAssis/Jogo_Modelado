import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Temporizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
    setImage(new GreenfootImage("VIDAS RESTANTE: " + getWorldOfType(MyWorld.class).personagem.vidaPersonagem, 20, Color.BLACK, Color.WHITE));
}
}
