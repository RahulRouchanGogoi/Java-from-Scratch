
interface member
{
    void callback();
}

class store
{
    member members[]=new member[10];
    int count=0;

    void register(member m)
    {
        members[count++]=m;
    }

    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            members[i].callback();
        }
    }
}

class customer implements member
{
    public String name;

    public customer(String name)
    {
        this.name=name;
    }

    public void callback()
    {
        System.out.println("Okay, I will visit,"+name);
    }
}



public class _03callBackMethod {
    public static void main(String[] args) {

        store s=new store();
        customer c1=new customer("Rahul");
        customer c2=new customer("Disha");

        s.register(c1);
        s.register(c2);

        s.inviteSale();

        
    }
    
}
