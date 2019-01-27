import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class treespawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class treespawn extends objmusuh
{
    private int shootjeda = 10;
    private int treesway = 1;
    private boolean bam = false;
    
    treespawn()
    {
        getImage().scale(getImage().getWidth(),getImage().getHeight());
    }
    /**
     * Act - do whatever the treespawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spawn();
        shootjeda--;
    }    

    public boolean shoot()
    {
        if(shootjeda <=0 && treesway == 1)
        {
            getWorld().addObject(new cong(), getX()+4, getY()-4);
            shootjeda = 380;
            return true;
        }
        return false;
    }

    public void spawn()
    {
        if (shootjeda == 0)
        {
            shoot();

            bam = true;
        } else {bam = false;}
    }

    public void hits()
    {
        if(kena(player.class))
        {
            stres();
            bam = false;
        }
    }

}
