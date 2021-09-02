import java.util.*;
class multiplication extends Thread
{
	public void run()
	{	
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 * "+i+"= "+(5*i));
		}
	}
}
class prime extends Thread
{
	public void run()
	{
		int flag=0,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an upper bound under which prike numbers shall be determined");
		size=sc.nextInt();
		System.out.println("-------Prime numbers under "+ size + " are-------");
		for(int i=1;i<=10;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{	
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0&&i!=1)
			System.out.println(i+" ");
		}
		
	}
}

public class program_16
{
	public static void main(String args[])
	{
		multiplication m=new multiplication();
		m.start();
		prime p=new prime();
		p.start();
	}
}