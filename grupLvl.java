import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class grupLvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grupLvl extends World
{
    private SimpleTimer timer = new SimpleTimer();
    
    public boolean setop = false;

    private int waktu = 0;

    GreenfootSound Overgame = new GreenfootSound("gameover.wav");
    GreenfootSound BGM = new GreenfootSound("bgsound.wav");

    private Label labelWaktu = new Label(" ", 50);
    
    /**
     * Constructor for objects of class grupLvl.
     * 
     */
    public grupLvl()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
        prepare();
    }

    //some timer thing
    public void timercount(){
        if(timer.millisElapsed()>1000 && !setop){
            waktu++;
            timer.mark();            
        }

        if(waktu >= 40 && !setop){
            setop = true;
            selese();

        }
    }

    public void showWaktu(){
        labelWaktu.setValue(waktu);        
    }

    public void setLabelWaktu(String isi){
        labelWaktu.setValue(isi);
    }
    //
    private void prepare()
    {
        addObject(labelWaktu,800,50);
    }

    public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        //System.out.println("ok");
        //BGM.play();
        
        BGM.setVolume(70);}else{
        //System.out.println("ga bunyi");
        }
    }

    public void stopped(){
        BGM.stop();
    }

    public void selese(){
        addObject(new gameover(), getWidth() / 2, getHeight() / 2);
        stopped();
        Overgame.play();
    }

}
