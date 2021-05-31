import java.util.*;
class Employee
{
	int eNo,eSalary;
	String eName;
	Employee(int no,String name,int salary)
	{
		eNo=no;
		eName=name;
		eSalary=salary;
	}
	void dis()
	{
		 System.out.println("eName :"+eName+"\t"+"esalary :"+eSalary);
	
	}
}
class Employee_check
{
	public static void main(String[] args)
	{
		int f=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the total no: of employees:");
		int n=ob.nextInt();
		Employee e_ar[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the eNO:");
			int eno=ob.nextInt();
			System.out.println("Enter the eName:");
			String ename=ob.next();
			System.out.println("Enter the eSalary:");
			int esalary=ob.nextInt();
			e_ar[i]=new Employee(eno,ename,esalary);
		}
		System.out.println("Enter the eNo: of the employee to search:");
		int en=ob.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(e_ar[i].eNo==en)
			{
				f=1;
				System.out.println("------------Employee found------");
				e_ar[i].dis();
			}
		}
		if(f==0)
		{
			System.out.println("Employee not found!!");
		}	
	}
}	 