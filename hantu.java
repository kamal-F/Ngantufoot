import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hantu extends objmusuh
{
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int frame = 0;
    private int animationcount;

    private int vSpeed = 0;
    private int acceleration = 1;

    private int tinggipijakan = getImage().getHeight();
    private int lebarpijakan = getImage().getWidth();
    private int jaraklangkah = (int)tinggipijakan/2;
    private int sudut = (int)lebarpijakan/2;

    private int speed = 2;

    private static final GreenfootImage musuhkir = new GreenfootImage("setan1.png");
    private static final GreenfootImage musuhkan = new GreenfootImage("setan2.png");
    private static final GreenfootImage eating1 = new GreenfootImage("setangotsoul.png");
    private static final GreenfootImage eating2 = new GreenfootImage("setangotsoul2.png");
    public void act() 
    {
        dilantai();
        bergerak();
        cekjatuh();
        animasi();
        //diserang();
        eatsoul();
        animationcount++;
    }

    boolean dilantai()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, bergerak.class);
        return under != null;
    }

    private void bergerak()
    {
        Actor ground = getOneObjectAtOffset(sudut, jaraklangkah, bergerak.class);
        if(ground == null)
        {
            speed *= -1;
            sudut *= -1;
        }
        else
        {
            move(speed);
        }
    }

    public void animasi()
    {
        if(speed<0)
        {
            setImage(musuhkir);
        }
        else
        {
            setImage(musuhkan);
        }
    }

    public void cekjatuh()
    {
        if (dilantai()== false)
        {
            fall();
        }
    }

    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }

    private void eatsoul()
    {
        if(kena(player.class))
        {
            speed = 0;
            stres();
            //losesane();
        }
        if (speed == 0)
        {
            setImage(eating1);
            // if(animationcount % 12 == 0);
            // mamam();
        }
    }

    // public void diserang()
    // {
    // if(kena(objmusuh.class))
    // {
    // //World myWorld = getWorld();
    // //player player = (player)myWorld();

    // //player

    // // lv2 lv2 = (lv2)myWorld;  
    // // sane sane = lv2.getsane();

    // if(kenaplayer == true) 
    // {
    // losesane();
    // kenaplayer = false;

    // if(sanity <=1)
    // {
    // hilangkan(player.class);
    // //Greenfoot.stop();
    // }       
    // } else {
    // kenaplayer = false;
    // }
    // }
    // }

    // public void losesane()
    // {
    // sanity--;
    // }
    
    
    //animation thing
    // public void mamam()
    // {
        // if(frame == 6)
        // {
            // setImage(eating2);
        // }
        // if(frame == 7)
        // {
            // setImage(eating2);
        // }
        // if(frame == 8)
        // {
            // setImage(eating2);
        // }
        // if(frame == 9)
        // {
            // setImage(eating2);
        // }
        // if(frame == 10)
        // {
            // setImage(eating2);
        // }
        // if(frame == 11) 
        // {
            // setImage(eating2);

        // }
        // if(frame == 12) 
        // {
            // setImage(eating2);
            // frame = 0;
        // }
        // frame++;
    // }

}
