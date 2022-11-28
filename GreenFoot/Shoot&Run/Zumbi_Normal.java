import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zumbi_Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zumbi_Normal extends Actor
{
    public void zombie(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4; 
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight); 
        setImage(myImage);
    }
    public void AndarTarget(double targetX, double targetY){
    turnTowards(getWorldOfType(MyWorld.class).personagem.getX(), getWorldOfType(MyWorld.class).personagem.getY());
    move(1);

    if(isTouching(Personagem.class)){
        setLocation(300, 100);
    }
    }
    public void act()
    {
    GreenfootImage image = getImage();
    image.scale(150, 100);
    setImage(image);
    
    turn(90);
    AndarTarget(getWorldOfType(MyWorld.class).personagem.getX(), getWorldOfType(MyWorld.class).personagem.getY());
    

    
    }
}
