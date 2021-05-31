import java.util.*;
class BOOK
{
	int ISBN,Price;
	String Title,Auther,Publisher;
	BOOK(int isbn,int price,String title,String auther,String publisher)
	{
		ISBN=isbn;
		Price=price;
		Title=title;
		Auther=auther;
		Publisher=publisher;
	}
	void dis()
	{
		System.out.println("ISBN:"+ISBN+"   Price:"+Price+"   Title:"+Title+"   Auther:"+Auther+"  Publisher:"+Publisher);
	}
}
class Book_sort
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		BOOK b_ar[]=new BOOK[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter ISBN:");
			int ISBN=ob.nextInt();
			System.out.print("Enter Price:");
			int Price=ob.nextInt();
			System.out.print("Enter Title:");
			String Title=ob.next();
			System.out.print("Enter Auther:");
			String Auther=ob.next();
			System.out.print("Enter Publisher:");
			String Publisher=ob.next();
			b_ar[i]=new BOOK(ISBN,Price,Title,Auther,Publisher);
			
		}
		String s[]=new String[5];
		for(int i=0;i<5;i++)
		{
			s[i]=b_ar[i].Title;
		}
		Arrays.sort(s);
		for(String i:s)
		{			
			for(int j=0;j<5;j++)
			{
				if(i==b_ar[j].Title)
				{
					b_ar[j].dis();
				}
			}
		}
	}
}
		
			

			

	
		