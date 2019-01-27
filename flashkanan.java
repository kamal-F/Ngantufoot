import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flashkanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flashkanan extends takingshoot
{
    public flashkanan()
    {
        durasikanan();
    }
    
    public void act() 
    {
        setLocation(getX() +1, getY());
        netralkan();
        
        durasikanan();
    }
    public void durasikanan()
    {      
        if (potoframe == 0)
        {
            setImage(potokan);
        }
        if (potoframe == 5)
        {
            setImage(potokan1);
        }
        if (potoframe == 11)
        {
            setImage(potokan2);
        }
        if (potoframe == 23)
        {
            setImage(potokan3);
        }
        if (potoframe == 29)
        {
            setImage(potokan4);
        }
        if (potoframe == 39)
        {
            setImage(potokan5);
        }
        if (potoframe == 47)
        {
            setImage(potokan6);
        }
        if (potoframe == 56)
        {
            setImage(potokan7);
        }
        if (potoframe == 61)
        {
            setImage(potokan8);
        }
        if (potoframe == 69)
        {
            setImage(potokan9);
        }
        if (potoframe == 76)
        {
            setImage(potokan10);
            potoframe = 0;
            getWorld().removeObject(this);
        }
        potoframe++;
    }
    
    
}
