import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personagem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personagem extends Actor
{
    
    
    public void act()
    {
        GreenfootImage image = getImage();
        image.scale(150, 100);
        setImage(image);
        if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(3);
            turn(270);
        }
        if (Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(3);
            turn(-90);
        }if (Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(3);
            turn(0);
        }
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(3);
            turn(90);
        }
    }
}
