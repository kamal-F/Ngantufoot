import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial extends World
{

    /**
     * Constructor for objects of class tutorial.
     * 
     */
    public tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
        setBackground("backgroundtutorial.png");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,866,553);
    }
}
