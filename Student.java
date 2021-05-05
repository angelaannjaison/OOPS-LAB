public class Student
{
	int rollno;
	String name;
	int mark1,mark2,mark3;
	void read(int rn,String nm,int m1,int m2,int m3)
	{
		rollno=rn;
		name=nm;
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void disp()
	{
		int sum=mark1+mark2+mark3;
		System.out.println(name+"  :  "+"Sum of marks of three subjects ="+sum);
	}
	public static void main(String[] args)
	{
		Student p1=new Student();
		p1.read(1,"Poppy",80,75,95);
		p1.disp();
		int s1=p1.mark1+p1.mark2+p1.mark3;

		Student p2=new Student();
		p2.read(2,"Kelly",90,95,98);
		p2.disp();
		int s2=p2.mark1+p2.mark2+p2.mark3;

		Student p3=new Student();
		p3.read(3,"Jake",50,95,68);
		p3.disp();
		int s3=p3.mark1+p3.mark2+p3.mark3;

		if(s1>s2 && s1>s3)
			System.out.println("Student who secured highest score is :"+p1.name);
		else if(s2>s1 && s2>s3)
			System.out.println("Student who secured highest score is :"+p2.name);
		else
			System.out.println("Student who secured highest score is :"+p3.name);
	}
}
