import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class howtoplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class howtoplay extends buton
{
    /**
     * Act - do whatever the howtoplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new tutorial();
            Greenfoot.setWorld(Start);
        }
    }    
}
