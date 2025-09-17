
class account
{
    private String accountNo;
    private String name;
    private String address;
    private String dob;
    protected long balance;

    public account(String accountNo,String name,String address,String dob)
    {
        this.accountNo=accountNo;
        this.name=name;
        this.address=address;
        this.dob=dob;
        this.balance=0;
    }

    public String getAccountNo()
    {
        return accountNo;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getDob()
    {
        return dob;
    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        if(balance>=0)
        {
        this.balance=balance;
        }
        else
        {
            System.out.println("Minimum balance must be 0.");
        }
    }
}

class savingsAccount extends account
{
    public savingsAccount(account acc)
    {
        super(acc.getAccountNo(), acc.getName(), acc.getAddress(), acc.getDob());
        this.balance=acc.getBalance();
    }

    public void deposit(long deposit)
    {
        if(deposit>0)
        {
        balance=balance+deposit;
        }
        else
        {
            System.out.println("The minimum deposit amount is 1.");
        }
    }

    public void withdraw(long withdraw)
    {
        if(balance<withdraw)
        {
            System.out.println("Low balance.");
        }
        else
        {
        balance=balance-withdraw;
        }
    }
}


public class _02inheritanceChallenge1 {
    public static void main(String[] args) {
        account a=new account("SBI-7044", "Rahul Rouchan Gogoi", "Raha, Nagaon, Assam", "04-07-2001");
        System.out.println("Name of customer:"+a.getName());
        a.setBalance(100);
        savingsAccount sv=new savingsAccount(a);
        sv.deposit(-1);
        System.out.println("Current balance:"+sv.getBalance());
        sv.withdraw(5);
        System.out.println("Current balance:"+sv.getBalance());
    }
    
}
