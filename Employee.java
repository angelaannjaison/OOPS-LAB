class Employee
{
	String name;
	int sallary,empid;
	void read(int id,String n,int s)
	{
		empid=id;
		name=n;
		sallary=s;
	}
	void dis()
	{
		System.out.println(empid+" "+name+" "+12*sallary);
	}
	public static void main(String arg[])
	{
		Employee ob1=new Employee();
		ob1.read(1,"LILLY",1000);
		ob1.dis();
		Employee ob2=new Employee();
		ob2.read(2,"POTTER",2000);
		ob2.dis();
	}
}