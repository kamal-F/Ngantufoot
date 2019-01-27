import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2 extends grupLvl
{

    /**
     * Constructor for objects of class lv2.
     * 
     */
    public lv2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(950, 600, 1); 
        prepare();
        stopped();
        started();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bergerak bergerak = new bergerak();
        addObject(bergerak,432,125);

        bergerak bergerak2 = new bergerak();
        addObject(bergerak2,757,340);

        bergerak bergerak3 = new bergerak();
        addObject(bergerak3,387,340);

        bergerak bergerak4 = new bergerak();
        addObject(bergerak4,767,560);

        bergerak bergerak5 = new bergerak();
        addObject(bergerak5,467,560);

        bergerak bergerak6 = new bergerak();
        addObject(bergerak6,167,560);

        player player = new player();
        addObject(player,108,58);

        treespawn treespawn = new treespawn();
        addObject(treespawn,201,259);

        lantai lantai4 = new lantai();
        addObject(lantai4,553,572);

        lantai lantai2 = new lantai();
        addObject(lantai2,187,137);       

        lantai lantai3 = new lantai();
        addObject(lantai3,744,353);

        doorlv2 doorlv2 = new doorlv2();
        addObject(doorlv2,911,478);

        hantu hantu = new hantu();
        addObject(hantu,463,38);
        hantu hantu2 = new hantu();
        addObject(hantu2,826,243);
        hantu hantu3 = new hantu();
        addObject(hantu3,491,249);

        hantu hantu4 = new hantu();
        addObject(hantu4,597,467);

        hantu hantu5 = new hantu();
        addObject(hantu5,500,484);
        hantu hantu6 = new hantu();
        addObject(hantu6,226,449);

    }

    public void started(){
        music();
    }

    public void act()
    {
        timercount();        
        showWaktu();
    }

}