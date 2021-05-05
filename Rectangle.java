public class Rectangle
{
	double width,length,area;
	String colour;
	Rectangle(double w,double l,String c)
	{
		width=w;
		length=l;
		colour=c;
	}
	void Area()
	{
		area=width*length;
	}
	void disp()
	{
		System.out.println("Width :" + "  " + width +" ," + "Length :" + "  "+ length +" , "+" Area :"+"  " + area+" , " + "Colour :" + "  "+colour);
	}
	public static void main(String[] args)
	{
		Rectangle p1=new Rectangle(3.3,10.0,"blue");
		p1.disp();

		Rectangle p2=new Rectangle(2.2,10.0,"gray");
		p2.disp();

		if(p1.area==p2.area && p1.colour==p2.colour)
			System.out.println("Matching Rectangles");
		else
			System.out.println("Non-Matching Rectangle");
	}
}