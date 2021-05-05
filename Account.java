class Account
{
	int acno;
	int balance=10000;
	String name,actype;
	void read(int no,String nm,String type)
	{
		acno=no;
		name=nm;
		actype=type;
	}
	void credit(int a)
	{
		balance=balance+a;
		System.out.println("after credict= "+balance);
	}
	void debit(int a)
	{
		if(balance-a<1000)
		{
			System.out.println("sorry!! insufficient balance");
		}
		else
		{
			balance=balance-a;
			System.out.println("After debit= "+balance);
		}
	}
	
	void dis()
	{
		System.out.println("---------------Account details--------------");
		System.out.println(acno+" "+name+" "+actype+" "+balance);
		System.out.println("-------------------");
	}
	public static void main(String arg[])
	{
		Account ob1=new Account();
		ob1.read(1000000,"ANJU","current");
		ob1.credit(1000);
		ob1.dis();
		Account ob2=new Account();
		ob2.read(4000,"JULIE","savings");
		ob2.debit(5000);
		ob2.dis();
	}
}