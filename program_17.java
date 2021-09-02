import java.util.*;
class fibonacci implements Runnable
{
	int l;
	fibonacci(int n)
	{
		l=n;
	}
	public void run()
	{
		int a=0,b=1;
		System.out.println("-------------Fibonacci series are-------------");
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=l;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		System.out.println("");
	}
}

class even implements Runnable
{
	int l;
	even(int n)
	{
		l=n;
	}
	public void run()
	{
		System.out.println("---------Even numbers are---------");
		for(int i=0;i<l;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}

public class program_17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a limit:");
		int l=sc.nextInt();
		fibonacci f=new fibonacci(l);
		Thread T1=new Thread(f);
		T1.start();
		even e=new even(l);
		Thread T2=new Thread(e);
		T2.start();
		
	}
}	