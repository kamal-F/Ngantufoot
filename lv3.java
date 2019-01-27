import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3 extends grupLvl
{

    /**
     * Constructor for objects of class lv3.
     * 
     */
    public lv3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(950, 600, 1); 
        //prepare();
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
        treespawn treespawn2 = new treespawn();
        addObject(treespawn2,30,486);

        hantu hantu = new hantu();
        addObject(hantu,779,359);
        
        hantu hantu2 = new hantu();
        addObject(hantu2,88,84);
        
        bergerak bergerak2 = new bergerak();
        addObject(bergerak2,745,423);

        bergerak bergerak3 = new bergerak();
        addObject(bergerak3,266,566);
        
        bergerak bergerak4 = new bergerak();
        addObject(bergerak4,564,566);

        hantu hantu3 = new hantu();
        addObject(hantu3,671,490);
        
        hantu hantu4 = new hantu();
        addObject(hantu4,371,499);

        bergerak bergerak = new bergerak();
        addObject(bergerak,150,148);

        lantai lantai = new lantai();
        addObject(lantai,561,577);        
        addObject(lantai,419,579); 

        player player = new player();
        addObject(player,162,508);

        lantai3 lantai3 = new lantai3();
        addObject(lantai3,120,148);

        flyinglantai flyinglantai = new flyinglantai();
        addObject(flyinglantai,292,148);

        treespawn treespawn = new treespawn();
        addObject(treespawn,30,291);

        lantai4 lantai4 = new lantai4();
        addObject(lantai4,235,536);
        
        lantai4 lantai42 = new lantai4();
        addObject(lantai42,275,508);
        
        lantai4 lantai43 = new lantai4();
        addObject(lantai43,323,480);
        
        lantai4 lantai44 = new lantai4();
        addObject(lantai44,369,454);

        lantai2 lantai2 = new lantai2();
        addObject(lantai2,680,424);

        doorlv3 doorlv3 = new doorlv3();
        addObject(doorlv3,910,60);

        lantai3 lantai32 = new lantai3();
        addObject(lantai32,938,146);
        
        lantai4 lantai45 = new lantai4();
        addObject(lantai45,21,370);

        lantai4 lantai46 = new lantai4();
        addObject(lantai46,210,180);
        
        lantai4 lantai47 = new lantai4();
        addObject(lantai47,257,201);
        
        lantai4 lantai48 = new lantai4();
        addObject(lantai48,302,229);
        
        lantai4 lantai49 = new lantai4();
        addObject(lantai49,354,255);
        
        lantai4 lantai410 = new lantai4();
        addObject(lantai410,402,281);
        
        lantai4 lantai411 = new lantai4();
        addObject(lantai411,444,302);
        
        lantai4 lantai412 = new lantai4();
        addObject(lantai412,491,334);
        
        lantai4 lantai413 = new lantai4();
        addObject(lantai413,546,364);
        
        lantai4 lantai414 = new lantai4();
        addObject(lantai414,582,397);
        
        
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
