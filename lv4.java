import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv4 extends grupLvl
{

    /**
     * Constructor for objects of class lv4.
     * 
     */
    public lv4()
    {

        prepare();
        stopped();
        started();
    }

    public void act()
    {
        timercount();
        showWaktu();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,459,51);
        
        player player2 = new player();
        addObject(player2,29,256);
        player2.setLocation(790,396);
        player2.setLocation(306,248);

        treespawn treespawn = new treespawn();
        addObject(treespawn,20,56);
        
        treespawn2 treespawn2 = new treespawn2();
        addObject(treespawn2,931,56);

        lantai lantai = new lantai();
        addObject(lantai,470,153);

        doorlv4 doorlv4 = new doorlv4();
        addObject(doorlv4,61,499);

        bergerak bergerak = new bergerak();
        addObject(bergerak,209,575);

        bergerak bergerak2 = new bergerak();
        addObject(bergerak2,180,320);

        lantai2 lantai2 = new lantai2();
        addObject(lantai2,190,320);

        flyinglantai flyinglantai = new flyinglantai();
        addObject(flyinglantai,466,457);

        hantu hantu = new hantu();
        addObject(hantu,41,238);
        
        hantu hantu2 = new hantu();
        addObject(hantu2,296,497);
       
        lantai3 lantai3 = new lantai3();
        addObject(lantai3,179,576);
    }
    
    public void started(){
        music();
    }
}
