import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends buton
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public back()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
            ((tutorial)getWorld()).stopped();
            World Start = getWorld();
            Start = new menu();
            Greenfoot.setWorld(Start);
        }
    }    
}
