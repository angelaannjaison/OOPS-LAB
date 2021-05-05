public class Account
{
	int accnum,balance=0;
	String accname,acctype;
	void read(int n,String nm,String t,int b)
	{
		accnum=n;
		accname=nm;
		acctype=t;
		balance=b;
	}
	void credit(int a)
	{
		balance=balance+a;
		System.out.println("AFTER CREDIT  : "+balance);
	}
	void debit(int a)
	{
		if(balance-a<1000)
		{
			System.out.println("INSUFFICIENT BALANCE");
		}
		else
		{
			balance=balance-a;
			System.out.println("AFTER DEBIT :"+balance);
		}
	}
	void disp()
	{
		System.out.println("ACCOUNT NUMBER :"+accnum+" "+"ACCOUNT NAME :"+accname+" "+"ACCOUNT TYPE :"+acctype+" "+"BALANCE :"+balance);
	}
	public static void main(String[] args)
	{
		Account p1=new Account();
		p1.read(111,"ANU","SAVINGS",100000);
		p1.credit(50000);
		p1.debit(5000);
		p1.disp();
		Account p2=new Account();
		p2.read(222,"LILLY","CURRENT",25000);
		p2.credit(5000);
		p2.debit(4000);
		p2.disp(); 	
	}
}
