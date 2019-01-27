 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class karakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class karakter extends Actor
{
    
    
    
    /**
     * Act - do whatever the karakter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public boolean kena(Class succ)
    {
        Actor actor = getOneObjectAtOffset(0, 0, succ);
        return actor != null;
    }
    public void hilangkan(Class succ)
    {
        Actor actor = getOneObjectAtOffset(0, 0, succ);
        if(actor != null)
        {
            getWorld().removeObject(actor);
            
        }
    }
    
}
