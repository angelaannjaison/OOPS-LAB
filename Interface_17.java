/* 17. Create an interface having prototypes of functions area() and perimeter(). 
Create two classes Circle and Rectangle which implement the above interface. 
Create a menu driven program to find the area and perimeter of objects.*/

import java.util.*;

interface calc
{
	double pi=3.14;
	void area();
	void perimeter();
}

class Circle implements calc
{
	double r;
	
	Circle(double radius)
	{
		r=radius;
	}
	
	public void area()
	{
		double a=pi*r*r;
		System.out.println("--------------Area of circle     :"+a+"----------------");
	}

	public void perimeter()
	{
		double p=2*pi*r;
		System.out.println("--------------Perimeter of circle :"+p+"--------------");
	}
}

class Rectangle implements calc
{
	double l,b;

	Rectangle(double length,double breadth)
	{
		l=length;
		b=breadth;
	}

	public void area()
	{
		double a=l*b;
		System.out.println("--------------Area of rectangle     :"+a+"----------------");
	}
	
	public void perimeter()
	{
		double p=2*(l+b);
		System.out.println("-------------Perimeter of rectangle :"+p+"----------------");
	}

}

class Interface_17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle      :");
		double radius=sc.nextDouble();
		System.out.println("Enter length of the rectangle  :");
		double length=sc.nextDouble();
		System.out.println("Enter breadth of the rectangle  :");
		double breadth=sc.nextDouble();

		Circle c=new Circle(radius);
		Rectangle r=new Rectangle(length,breadth);

		int ch;
		do
		{
			System.out.println("\nCHOICES ARE :");
			System.out.println("1.Area of circle");
			System.out.println("2.Perimeter of circle");
			System.out.println("3.Area of rectangle");
			System.out.println("4.Perimeter of rectangle");
			System.out.println("*********EXIT**********");

			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:c.area();break;
				case 2:c.perimeter();break;
				case 3:r.area();break;
				case 4:r.perimeter();break;
				case 5:break;
				default:System.out.println("xxxxxxxxxxxxxx Please enter a valid choice xxxxxxxxxxx");
			}
		}while(ch!=5);
	}

}
