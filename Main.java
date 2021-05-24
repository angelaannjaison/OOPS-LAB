class CPU
{
	int price=23000;
	class Processor
	{
		static int no_core=4;
		static String manufacture="intel";
		public void dis()
		{
			System.out.println("NO_core="+no_core+" "+"Processor Manufacturer="+manufacture);
		}
	}
	static class Ram
	{
		static int memory=4;
		static String manufacturer="IBM";
		void disp()
		{
			System.out.println("Memory="+memory+" "+"Ram manufacturer="+manufacturer);
		}
	}
		
		
}
class Main
{
	public static void main(String[] args)
	{
		CPU ob1=new CPU();
		System.out.println("cpu price="+ob1.price);
		CPU.Processor ob2=ob1.new Processor();
		ob2.dis();
		CPU.Ram ob3=new CPU.Ram();
		ob3.disp();
	}
}
