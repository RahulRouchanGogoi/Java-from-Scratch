/*
   QUESTION:
   Create a Java program that defines two classes: `product` and `customer`. 
   - The `product` class should store product details such as item number, name, price, and quantity.
   - It should have two constructors: one that initializes the product with a default price (100) and quantity (1), 
     and another that allows specifying all values.
   - The `customer` class should store customer details such as customer ID, name, address, and phone number.
   - It should also have two constructors: one with only customer ID and name (defaulting other values to "N/A"),
     and another allowing full initialization.
   - Implement setter and getter methods for updating and retrieving product and customer details.
   - In the `main` method, create instances of both classes, update some values, and display the details.
*/

class product
{
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public product(String item,String n)
    {
        itemNo=item;
        name=n;
        price=100;
        quantity=1;

    }

    public product(String item,String n,double p,int q)
    {
        itemNo=item;
        name=n;
        price=p;
        quantity=q;

    }


    public void setPrice(double p)
    {
        price=p;
    }

    public void setQuantity(int q)
    {
        quantity=q;
    }

    public String getItemNo()
    {
        return itemNo;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price*quantity;
    }
    public  int getQuantity()
    {
        return quantity;
    }
    
}

class customer
{
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public customer(String cId,String cName)
    {
        customerId=cId;
        name=cName;
        address="N/A";
        phoneNumber="N/A";
    }

    public customer(String cId,String cName, String add,String ph)
    {
        customerId=cId;
        name=cName;
        address=add;
        phoneNumber=ph;
    }

    public void setAddress(String add)
    {
        address=add;
    }

    public void setPhone(String ph)
    {
        phoneNumber=ph;
    }

    public String getCustomerId()
    {
        return customerId;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getNumber()
    {
        return phoneNumber;
    }

}

public class _06challenge1 {
    public static void main(String[] args) {
        product p=new product("1ABC23", "Hard drive");
        p.setQuantity(5);

        System.out.println("Product Id:"+p.getItemNo());
        System.out.println("Product Name:"+p.getName());
        System.out.println("Product Total Price:"+p.getPrice());
        System.out.println("Product Quantity:"+p.getQuantity());

        customer c=new customer("0001", "Rahul Rouchan Gogoi");

        System.out.println("Customer Id:"+c.getCustomerId());
        System.out.println("Customer Name:"+c.getName());

        c.setAddress("Raha, Nagaon, Assam, Pin:782103");
        c.setPhone("+91 56780 02367");


        System.out.println("Customer Address:"+c.getAddress());
        System.out.println("Customer Contact Number:"+c.getNumber());

    }
}
