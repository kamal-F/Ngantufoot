
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class objmusuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class objmusuh extends karakter
{
    boolean kenaplayer = true;
    GreenfootSound Overgame = new GreenfootSound("gameover.wav");
    GreenfootSound laugh = new GreenfootSound("ketawa.wav");
    /**
     * Act - do whatever the objmusuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void stres()
    {
        hilangkan(player.class);
        Overgame.play();
        laugh.play();
        laugh.setVolume(85);
        //getWorld().addObject(new gameover(), getWorld().getWidth() /  2, getWorld().getHeight() / 2);
         grupLvl dunia = (grupLvl)getWorld();
            dunia.setop=true;
            dunia.selese();
        //Greenfoot.stop();
        
    }
    
    
    //public void silau()
    // {
      // if(kena(flashkanan.class)||kena(flashkiri.class))
      // {
        // hilangkan(hantu.class);
      // }
   // }
}
