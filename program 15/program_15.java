import java.util.*;
public class program_15
{
	public static void main(String args[])
	{
		int size,num,sum=0,count=0;
		float avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of positive integers to be calculated");
		size=sc.nextInt();
		System.out.println("Enter any integer");
		for(int i=0;i<size;i++)
		{
			num=sc.nextInt();
			try
			{
				if(num<0)
				{
					size++;
					count++;
					throw new Userdef_Exception15("Error:Negetive number not allowed");
				}
				else
				{
					sum=sum+num;
				}
			}
			catch(Userdef_Exception15 e)
			{
				System.out.println(e);
			}
		}
		size=size-count;
		avg=sum/size;
		System.out.println("SUM ="+sum);
		System.out.println("AVERAGE ="+avg);
	}
}