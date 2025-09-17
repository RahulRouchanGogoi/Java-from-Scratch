class phone
{
    public void call()
    {
        System.out.println("Phone Call.");
    }
    public void sms()
    {
        System.out.println("Phone sending sms.");
    }
}

interface Icamera
{
    void click();
    void record();
}

interface Imusic
{
    void play();
    void pause();
    void stop();
}

class smartPhone extends phone implements Icamera,Imusic
{
    public void videoCall()
    {
        System.out.println("Making a video call.");
    }

    @Override
    public void click()
    {
        System.out.println("Click a photo.");
    }

    @Override
    public void record()
    {
        System.out.println("Record a video.");
    }

    @Override
    public void play()
    {
        System.out.println("Play the music.");
    }

    @Override
    public void pause()
    {
        System.out.println("Pause the music.");
    }

    @Override
    public void stop()
    {
        System.out.println("Stop the music.");
    }
}

public class _02interfaceExample1 {
    public static void main(String[] args)
    {
        smartPhone s=new smartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();

        //Accessing with camera reference
        Icamera c=s;
        c.click();
        c.record();
        

    }
    
}
