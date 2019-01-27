import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends buton
{
    /**
     * Act - do whatever the gameover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(null))
        {

            World Start = getWorld();
            Start = new menu();
            Greenfoot.setWorld(Start);
            hilangkan(gameover.class);

        }
        
    }    
}
