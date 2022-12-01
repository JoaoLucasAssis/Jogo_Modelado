import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Temporizador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Temporizador extends Actor
{
public int timer = 55*60;
 
public void Timer()
{
    updateImage();
}
 
public void act()
{
    timer--;
    if (timer % 55 == 0) updateImage();
    if (timer < 1) Greenfoot.stop();
}
 
public void updateImage()
{
    setImage(new GreenfootImage("TEMPO RESTANTE: " + timer/55, 35, Color.WHITE, null));
}
}
