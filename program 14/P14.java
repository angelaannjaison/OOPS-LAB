import Arithmetic.*;
import java.util.*;

public class P14 implements Arithmetic.Multiplication,Arithmetic.Subtraction
{
	public void mul(float a,float b)
	{
		System.out.println("MULTIPLICATION :number1 x number2 ="+(a*b));
	}

	public void sub(float a,float b)
	{
		System.out.println("SUBTRACTION :number1 - number2 ="+(a-b));
	}

	public static void main(String args[])
	{
		float n1,n2;
		int c;
		Scanner s=new Scanner(System.in);
		Addition a=new Addition();
		Division d=new Division();
		P14 obj=new P14();
		System.out.println("Enter number1");
		n1=s.nextFloat();
		System.out.println("Enter number2");
		n2=s.nextFloat();
		
		do
		{
			System.out.println("Enter a choice 1.Addition 2.Subtraction 3.Division 4.Multiplication 5.Exit");
			c=s.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("ADD :number1 + number2 ="+a.add(n1,n2));
					break;
				case 2:
					obj.sub(n1,n2);
					break;
				case 3:
					System.out.println("DIVISION :number1 / number2 ="+d.div(n1,n2));
					break;
				case 4:
					obj.mul(n1,n2);
					break;
				case 5:
					System.out.println("-----------------Exit-----------------");
			}
		}while(c!=5);
	} 
}



