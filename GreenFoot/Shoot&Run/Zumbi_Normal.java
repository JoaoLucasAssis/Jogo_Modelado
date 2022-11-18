import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zumbi_Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zumbi_Normal extends Actor
{
    /**
     * Act - do whatever the Zumbi_Normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    public void AndarTarget(double targetX, double targetY){
    double personagemX;
    personagemX = getX();
    
    double personagemY;
    personagemY = getY();
    
    double distX;
    distX = targetX - personagemX;
    
    double distY;
    distY = targetY - personagemY;
    
    double distTargetDouble;
    distTargetDouble = Math.sqrt((distY * distY) + (distX * distX));
    int distTarget = (int) distTargetDouble / 2;
    
    double turnRadiusDouble;
    turnRadiusDouble = Math.toDegrees(Math.atan(distY / distX));
    int turnRadius = (int) turnRadiusDouble;
    }
    }
}
