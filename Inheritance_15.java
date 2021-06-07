import java.util.*;
class Person
{
	String Name,Gender,Address;
	int Age;
	Person(String n,String g,int age,String a)
	{
		Name=n;
		Gender=g;
		Age=age;
		Address=a;
	}
	void dis()
	{
		System.out.print("Name:"+Name+"\t"+"Gender:"+Gender+"\t"+"Age:"+Age+"\t"+"Address:"+Address+"\t");
	}
}
class Employee extends Person
{
	int Emp_id,salary;
	String company_name,qualification;
	Employee(String n,String g,int age,String a,int eid,String c_name,String q,int s)
	{
		super(n,g,age,a);
		Emp_id=eid;
		salary=s;
		company_name=c_name;
		qualification=q;
	}
	void dis()
	{
		super.dis();
		System.out.println("Emp_id:"+Emp_id+"\t"+"CompanyName:"+company_name+"\t"+"Qualification:"+qualification+"\t"+"Salary:"+salary+"\t");
	}
}
class Teacher extends Employee
{
	int T_id;
	String subject,department;
	Teacher(String n,String g,int age,String a,int eid,String c_name,String q,int s,int t,String sub,String dep)
	{
		super(n,g,age,a,eid,c_name,q,s);
		T_id=t;
		subject=sub;
		department=dep;
	}
	void dis()
	{
		super.dis();
		System.out.println("Teacher_id:"+T_id+"\t"+"Subject:"+subject+"\t"+"Department:"+department);
	}
}
 
class Inheritance_15
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the total no: of teacher:");
		int num=ob.nextInt();
		Teacher ar[]=new Teacher[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("Enter the name:");
			String n=ob.next();
			System.out.print("Enter the gender:");
			String g=ob.next();
			System.out.print("Enter the age:");
			int age=ob.nextInt();
			System.out.print("Enter the Address:");
			String a=ob.next();
			System.out.print("Enter the Emp_id:");
			int e_id=ob.nextInt();
			System.out.print("Enter the company_name:");
			String c_name=ob.next();
			System.out.print("Enter the qualification:");
			String q=ob.next();
			System.out.print("Enter the salary:");
			int s=ob.nextInt();
			System.out.print("Enter the Teacher_id:");
			int t_id=ob.nextInt();
			System.out.print("Enter the Subject:");
			String sub=ob.next();
			System.out.print("Enter the department:");
			String dep=ob.next();
			System.out.println();
			ar[i]=new Teacher(n,g,age,a,e_id,c_name,q,s,t_id,sub,dep);
		}
		for(Teacher i:ar)
		{
			System.out.println("--------------------------------------------------");
			i.dis();
			System.out.println("--------------------------------------------------");
		}
	}
}
		
