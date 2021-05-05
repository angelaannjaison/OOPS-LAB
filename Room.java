public class Room
{
	int roomno;
	String roomtype;
	int roomarea;
	Room(int n,String t,int a)
	{
		roomno=n;
		roomtype=t;
		roomarea=a;
	}
	Room()
	{
		roomno=111;
		roomtype="A";
		roomarea=956;		
	}
	void disp()
	{
		System.out.println("Room no :"+ roomno + "  "+"Room Type :"+ roomtype + "  "+"Room Area :"+roomarea);
	}
	public static void main(String[] args)
	{
		Room p1=new Room(888,"B",586);
		p1.disp();

		Room p2=new Room();
		p2.disp();
	}
}