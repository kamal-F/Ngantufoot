import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endgame extends buton
{
    /**
     * Act - do whatever the endgame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(null))
        {

            World Start = getWorld();
            Start = new menu();
            Greenfoot.setWorld(Start);
            hilangkan(endgame.class);

        }
    }    
}
