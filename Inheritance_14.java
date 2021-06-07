import java.util.*;
class Employee
{
	int empid,salary;
	String Name,Address;
	Employee(int e,String n,String a,int s)
	{
		empid=e;
		Name=n;
		Address=a;
		salary=s;
	}
	void dis()
	{
		System.out.print("Emp_id:"+empid+"\t"+"Name:"+Name+"\t"+"Address:"+Address+"\t"+"Salary:"+salary);
	}
}
class Teacher extends Employee
{
	String department,subject;
	Teacher(int e,String n,String a,int s,String d,String sub)
	{
		super(e,n,a,s);
		department=d;
		subject=sub;
	}
	void dis()
	{
		System.out.println("Department: "+department+"\t"+" Subject:"+subject);
	}
	void print()
	{
		super.dis();
		dis();
	}
}
class Inheritance_14
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of teachers:");
		int n=ob.nextInt();
		Teacher ar[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Emp_id:");
			int e=ob.nextInt();
			System.out.print("Enter Name:");
			String name=ob.next();
			System.out.print("Enter Address:");
			String a=ob.next();
			System.out.print("Enter salary:");
			int s=ob.nextInt();
			System.out.print("Enter department:");
			String d=ob.next();
			System.out.print("Enter Subject:");
			String sub=ob.next();
			ar[i]=new Teacher(e,name,a,s,d,sub);
			System.out.println("\n");
			ar[i]=new Teacher(e,name,a,s,d,sub);
		}
		for( Teacher i:ar)
		{
			System.out.println("--------------------------------------------------");
			i.print();
			System.out.println("----------------------------------------------------");
		}
	
	}
}	