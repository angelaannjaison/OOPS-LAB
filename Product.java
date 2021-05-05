public class Product
{
    String pname;
    int pcode,price;

    void read(int c,String n,int p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void disp()
    {
        System.out.println(pcode+" "+pname+" "+price);
    }
    
    void lowprice()
    {
	System.out.println("The product with lowest price is "+pname);
    }

    public static void main(String[] args)
    {
        Product p1=new Product();
	p1.read(111,"TELEVISION",20000);
	p1.disp();
        Product p2=new Product();
	p2.read(222,"WASHING MACHINE",15000);
	p2.disp();
        Product p3=new Product();
	p3.read(333,"RADIO",5000);
	p3.disp();

        if (p1.price<=p2.price && p1.price<=p3.price)
        p1.lowprice();
        if (p2.price<=p1.price && p2.price<=p3.price)
        p2.lowprice();
        if (p3.price<=p2.price && p3.price<=p2.price)
        p3.lowprice();
    }
}


