public class Employee
{
	int employeeid;
	String name;
	int monthlysalary;
	void read(int id,String nm,int ms)
	{
		employeeid=id;
		name=nm;
		monthlysalary=ms;
	}
	void disp()
	{
		System.out.println("ID :"+employeeid+" , "+"NAME :"+name+" , "+"YEARLY SALARY :"+monthlysalary*12);
	}	
	public static void main(String[] args)
	{
		Employee p1=new Employee();
		p1.read(111,"LILLY",58000);
		p1.disp();
		Employee p2=new Employee();
		p2.read(222,"POTTER",100000);
		p2.disp();
	}
}
