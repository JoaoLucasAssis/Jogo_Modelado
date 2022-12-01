import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Projetil extends Actor
{
    public void disparar() {
            Projetil p = new Projetil();
            getWorld().addObject(p, 300, 300);
            move(2);
            //trajetoria();
    }
    /*public void trajetoria(){
        turnTowards(getWorldOfType(MyWorld.class).zumbi_Normal.getX(), getWorldOfType(MyWorld.class).zumbi_Normal.getY());
        move(3);
    }*/
    
    public void act()
    {
        
        GreenfootImage projetil = new GreenfootImage("Projetil.png");
        setImage(new GreenfootImage("Projetil.png"));
    }
}
