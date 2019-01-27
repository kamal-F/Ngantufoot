import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flashkiri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flashkiri extends takingshoot
{
     public flashkiri()
    {
        durasikiri();
    }
    public void act() 
    {
        setLocation(getX() - 1, getY());
        netralkan();
        durasikiri();
        
    }
    public void durasikiri()
    {      
        if (potoframe == 0)
        {
            setImage(potokir);
        }
        if (potoframe == 5)
        {
            setImage(potokir1);
        }
        if (potoframe == 11)
        {
            setImage(potokir2);
        }
        if (potoframe == 23)
        {
            setImage(potokir3);
        }
        if (potoframe == 29)
        {
            setImage(potokir4);
        }
        if (potoframe == 39)
        {
            setImage(potokir5);
        }
        if (potoframe == 47)
        {
            setImage(potokir6);
        }
        if (potoframe == 56)
        {
            setImage(potokir7);
        }
        if (potoframe == 61)
        {
            setImage(potokir8);
        }
        if (potoframe == 69)
        {
            setImage(potokir9);
        }
        if (potoframe == 76)
        {
            setImage(potokir10);
            potoframe = 0;
            getWorld().removeObject(this);
        }
        potoframe++;
    }
    
    
    
}
