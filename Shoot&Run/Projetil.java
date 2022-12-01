import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Projetil extends Actor
{
    public void act()
    {
        GreenfootImage projetil = new GreenfootImage("projetil.png");
        setImage(new GreenfootImage("projetil.png"));
        move(10);
        if(isAtEdge())
        {
          getWorld().removeObject(this);  
        }
    }
}
