
class car
{
    public void start()
    {
        System.out.println("Car Started.");
    }

    public void changeGear()
    {
        System.out.println("Car gear changed");
    }

    public void accelerate()
    {
        System.out.println("Car is accelerated.");
    }
}

class luxuryCar extends car
{
    @Override
    public void changeGear()
    {
        System.out.println("Automatic gear.");
    }

    public void openSunroof()
    {
        System.out.println("Sun roof is opened");
    }
}

public class _08methodOverridingExample2 {
    public static void main(String[] args) {
        luxuryCar l=new luxuryCar();
        l.start();
        l.changeGear();// super class changeGear() method is shadowed
        l.accelerate();
        l.openSunroof();
    }
    
}
