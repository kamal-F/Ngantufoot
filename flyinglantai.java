import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flyinglantai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flyinglantai extends platform
{
    public flyinglantai()
    {
    }
    private int way = 1;
    /**
     * Act - do whatever the flyinglantai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gerak();
    }    
    
    public void gerak()
    {
         if(way == 1)
        {
            move(2);
            
        }
        
        if(way == -1)
        {
            move(-2);
        }
        
        if(getX() == 760)
        {
            way = -1;
        }
        
        if(getX() == 290)
        {
            way = 1;
        }
    }
    
}

