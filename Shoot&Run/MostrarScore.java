import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MostrarScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MostrarScore extends Actor
{
    public void act()
    {
        mostrarScore();
    }
    public void mostrarScore() {
        setImage(new GreenfootImage("SCORE: " + getWorldOfType(MyWorld.class).personagem.score, 35, Color.WHITE, null));
    }
}
