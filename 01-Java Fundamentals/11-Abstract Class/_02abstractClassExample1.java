
abstract class hospital
{
    abstract public void appointment();
    abstract public void admit();
    abstract public void emergency();
}

class myHospitalOne extends hospital
{
    @Override
    public void appointment()
    {
        System.out.println("Appointment booked at my hospital 1.");
    }

    @Override
    public void admit()
    {
        System.out.println("Amitted at my hospital 1.");
    }

    @Override
    public void emergency()
    {
        System.out.println("Emergency ward constructed at my hospital 1.");;
    }
    
}

public class _02abstractClassExample1 {
    public static void main(String[] args) {
        hospital h=new myHospitalOne();
        h.appointment();
        h.admit();
        h.emergency();
    }
    
}
