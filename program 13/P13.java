import Graphics.*;
import java.util.*;
public class P13 implements Graphics.Square,Graphics.Rectangle
{
	public void sq_area(float a)
	{
		System.out.println("Area of square ="+a*a);
	}
	public void rect_area(float l,float b)
	{
		System.out.println("Area of rectangle ="+l*b);
	}
	public static void main(String arg[])
	{
		float a,l,b,h,r;
		int c;
		Scanner s=new Scanner(System.in);
		Circle circ=new Circle();
		Triangle tri=new Triangle();
		P13 obj=new P13();
		do
		{
			System.out.println("Enter 1.Rectangle 2.Triangle 3.Square 4.Circle 5.Exit");
			c=s.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter length :");
					l=s.nextFloat();
					System.out.println("Enter breadth :");
					b=s.nextFloat();
					obj.rect_area(l,b);
					break;
				case 2:
					System.out.println("Enter breadth :");
					b=s.nextFloat();
					System.out.println("Enter height :");
					h=s.nextFloat();
					System.out.println("Area of triangle ="+tri.tri_area(b,h));
					break;
				case 3:
					System.out.println("Enter side =");
					a=s.nextFloat();
					obj.sq_area(a);
					break;
				case 4:
					System.out.println("Enter radius =");
					r=s.nextFloat();
					System.out.println("Area of circle ="+circ.circ_area(r));
					break;
				case 5:
					System.out.println("Exit");	

			}
		}while(c!=5);
	}
}