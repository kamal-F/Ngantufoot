import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends karakter
{
    boolean kenaplayer = true;
    //boolean kenamusuh = true;
    private  boolean lompats = false;
    private int lompatjeda = 10;
    private int potojeda = 10;
    private int arahpoto = 1;
    private boolean cekrek = false;
    //private boolean cekrek2 = false;
    int sanity = 7;

    public int dihantui;
    public boolean ishit;

    private int vSpeed = 0;
    private int acceleration = 1;
    private int lompat = -10;

    private int speedjalan = 3;
    private boolean jalan = false;

    private boolean hi = false;
    
    
    GreenfootSound flash = new GreenfootSound("camera.wav");
    
    int framelari = 0;
    
    private static final GreenfootImage lar1 = new GreenfootImage("humanr1.png");
    private static final GreenfootImage lar2 = new GreenfootImage("humanr2.png");
    private static final GreenfootImage lar3 = new GreenfootImage("humanr3.png");
    private static final GreenfootImage lar4 = new GreenfootImage("humanr3.5.png");
    private static final GreenfootImage lar5 = new GreenfootImage("humanr4.png");
    
    private static final GreenfootImage lal1 = new GreenfootImage("humanl1.png");
    private static final GreenfootImage lal2 = new GreenfootImage("humanl2.png");
    private static final GreenfootImage lal3 = new GreenfootImage("humanl3.png");
    private static final GreenfootImage lal4 = new GreenfootImage("humanl3.5.png");
    private static final GreenfootImage lal5 = new GreenfootImage("humanl4.png");
    
    private static final GreenfootImage potor = new GreenfootImage("humanpicr.png");
    private static final GreenfootImage potol = new GreenfootImage("humanpicl.png");
    private static final GreenfootImage nundr = new GreenfootImage("humancrouchr.png");
    private static final GreenfootImage nundl = new GreenfootImage("humancrouchl.png");
    private static final GreenfootImage nundserkan = new GreenfootImage("humancrouchattckr.png");
    private static final GreenfootImage nundserkir = new GreenfootImage("humancrouchattckl.png");
    private static final GreenfootImage lompatkan = new GreenfootImage("humanlompatr.png");
    private static final GreenfootImage lompatkir = new GreenfootImage("humanlompatl.png");
    public static final GreenfootImage crawr = new GreenfootImage("humancrawlingr.png");
    public static final GreenfootImage crawl = new GreenfootImage("humancrawlingl.png");

    /**
     * Act - do whatever the orang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        dihantui = 0;
        ishit = false;

        jalan();
        serang();
        cekjatuh();
        potojeda--;
        lompatjeda--; 
        acttambahan();
       
        portal();
        
        
        if(!dilantai() && getY()>(getWorld().getHeight()-getImage().getHeight())){
            grupLvl dunia = (grupLvl)getWorld();
            dunia.setop=true;
            dunia.selese();
        } 
        grupLvl dunia = (grupLvl)getWorld();
        if(dunia.setop){dunia.removeObject(this);}
        
        //kenaserang();
    }

    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;

    }

    public void jalan()
    {
        
        
        
        if(Greenfoot.isKeyDown("d"))
        {
            jalan = true;
            arahpoto = 1;
            move(speedjalan);
            if(jalan = true)
            {
                larikanan();
            }

        }
                     
        if(Greenfoot.isKeyDown("a"))
        {
            jalan = true;
            arahpoto = -1;
            move(speedjalan * -1);
            if(jalan = true)
            {
                larikiri();
            }

        } 
        if(Greenfoot.isKeyDown("w") && (dilantai() ==true)) 
        {
            lompats = true;
            if (lompatjeda <= 0){
                vSpeed = lompat;
                fall();
                lompatjeda = 30;

            }
        }
        if (!Greenfoot.isKeyDown("w") && (dilantai() ==true)){
            lompats = false;
        }

        if (dilantai() == false && arahpoto == 1)
        {
            setImage(lompatkan);
        }
        if (dilantai() == false && arahpoto == -1)
        {
            setImage(lompatkir);
        }

    }

    public void serang()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            jepret();
            cekrek = true;
            speedjalan = 0;
            if(cekrek = true && arahpoto == 1)
            {
                setImage(potor);
            }
            if(cekrek = true && arahpoto == -1)
            {
                setImage(potol);
            }
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            cekrek = false;
            speedjalan = 3;
        }

        if(Greenfoot.isKeyDown("s") && arahpoto == 1)
        {
            setImage(nundr);
            speedjalan = 1;
            lompat = 0;
        } else if(arahpoto == -1 && Greenfoot.isKeyDown("s")){
            speedjalan = 1;
            setImage(nundl);}

        if (!Greenfoot.isKeyDown("s"))
        {lompat = -10;}

    }

    public void acttambahan(){

        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("space"))
        { cekrek = true;
            if(cekrek = true && arahpoto == 1)
            {
                setImage(nundserkan);
            }
            if(cekrek = true && arahpoto == -1)
            {
                setImage(nundserkir);
            }

        } else if (!Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("space"))
        {
            cekrek = false;
        }

        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setImage(crawr);
            cekrek = false;
            potojeda = 11;
        }

        if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setImage(crawl);
            cekrek = false;
            potojeda = 11;
        }

    }

    boolean dilantai()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, platform.class);
        return under != null;
    }

    public void cekjatuh()
    {
        if (dilantai()== false)
        {
            fall();
        }
    }

    public boolean jepret()
    {
        if(potojeda <=0 && arahpoto == 1)
        {
            flash.play();
            getWorld().addObject(new flashkanan(), getX()+4, getY()-4);
            potojeda = 170;
            return true;
        }
        if(potojeda <=0 && arahpoto == -1)
        {
            flash.play();
            getWorld().addObject(new flashkiri(), getX()+4, getY()-4);
            potojeda = 170;
            return true;
        }
        return false;
    }

    
    
    public void portal()
    {
        
        if(kena(doorlv2.class))
        {            
            Greenfoot.setWorld(new lv3());
        }
        if(kena(doorlv3.class))
        {
            Greenfoot.setWorld(new lv4());
        }
        if(kena(doorlv4.class))
        {
            Greenfoot.setWorld(new end());
        }
    }

    //animation thing
    public void larikanan()
    {
        
        if(framelari == 1)
        {
            setImage(lar1);
        }
        if(framelari == 6)
        {
            setImage(lar2);
        }
        if(framelari == 12)
        {
            setImage(lar3);
        }
        if(framelari == 18)
        {
            setImage(lar4);
        }
        if(framelari == 24) 
        {
            setImage(lar5);
            framelari = 0;
        }
        framelari++;
    }
    public void larikiri()
    {
        
        if(framelari == 1)
        {
            setImage(lal1);
        }
        if(framelari == 6)
        {
            setImage(lal2);
        }
        if(framelari == 12)
        {
            setImage(lal3);
        }
        if(framelari == 18)
        {
            setImage(lal4);
        }
        if(framelari == 24) 
        {
            setImage(lal5);
            framelari = 0;
        }
        framelari++;
    }
}