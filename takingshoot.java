import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class takingshoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class takingshoot extends karakter
{
    public static final GreenfootImage potokan = new GreenfootImage("flashr.png");
    public static final GreenfootImage potokan1 = new GreenfootImage("flashr1.png");
    public static final GreenfootImage potokan2 = new GreenfootImage("flashr2.png");
    public static final GreenfootImage potokan3 = new GreenfootImage("flashr3.png");
    public static final GreenfootImage potokan4 = new GreenfootImage("flashr4.png");
    public static final GreenfootImage potokan5 = new GreenfootImage("flashr5.png");
    public static final GreenfootImage potokan6 = new GreenfootImage("flashr6.png");
    public static final GreenfootImage potokan7 = new GreenfootImage("flashr7.png");
    public static final GreenfootImage potokan8 = new GreenfootImage("flashr8.png");
    public static final GreenfootImage potokan9 = new GreenfootImage("flashr9.png");
    public static final GreenfootImage potokan10 = new GreenfootImage("flashr10.png");
    public static final GreenfootImage potokir = new GreenfootImage("flashl.png");
    public static final GreenfootImage potokir1 = new GreenfootImage("flashl1.png");
    public static final GreenfootImage potokir2 = new GreenfootImage("flashl2.png");
    public static final GreenfootImage potokir3 = new GreenfootImage("flashl3.png");
    public static final GreenfootImage potokir4 = new GreenfootImage("flashl4.png");
    public static final GreenfootImage potokir5 = new GreenfootImage("flashl5.png");
    public static final GreenfootImage potokir6 = new GreenfootImage("flashl6.png");
    public static final GreenfootImage potokir7 = new GreenfootImage("flashl7.png");
    public static final GreenfootImage potokir8 = new GreenfootImage("flashl8.png");
    public static final GreenfootImage potokir9 = new GreenfootImage("flashl9.png");
    public static final GreenfootImage potokir10 = new GreenfootImage("flashl10.png");
    public int potoframe = 0;
    /**
     * Act - do whatever the takingshoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //netralkan();
        potoframe++;
    }
    public void netralkan()
    {
        if(flashed(objmusuh.class))
        {
            gone(objmusuh.class);
            
        }
    }
    
    public boolean flashed(Class succ)
    {
        Actor actor = getOneObjectAtOffset(0, 0, succ);
        return actor != null;
    }
    public void gone(Class succ)
    {
        Actor actor = getOneObjectAtOffset(0, 0, succ);
        if(actor != null)
        {
            getWorld().removeObject(actor);
            
        }
    }
}
