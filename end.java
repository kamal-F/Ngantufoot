import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class end here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class end extends grupLvl
{

    /**
     * Constructor for objects of class end.
     * 
     */
    public end()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new endgame(), getWidth() / 2, 
            getHeight() / 2);
    }
    
    
}
