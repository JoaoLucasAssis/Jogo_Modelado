import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public Personagem personagem;
    public Zumbi_Normal zumbi_Normal;
    
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1020, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        personagem = new Personagem();
        addObject(personagem,499,406);

        zumbi_Normal = new Zumbi_Normal();
        addObject(zumbi_Normal,688,390);
        
        Temporizador temporizador = new Temporizador();
        addObject(temporizador,502,110);

        MostrarVida mostrarvida = new MostrarVida();
        addObject(mostrarvida, 115,691);
    }
}
