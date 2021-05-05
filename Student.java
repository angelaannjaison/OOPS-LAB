class Student
{
	String name;
	int rollno,mark1,mark2,mark3;
	void read(int r,String n,int m1,int m2,int m3)
	{
		rollno=r;
		name=n;
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	void dis()
	{
		int sum=mark1+mark2+mark3;
		System.out.println("sum of mark of "+name+" is"+" "+sum);
	}
	public static void main(String arg[])
	{
		Student ob1=new Student();
		ob1.read(1,"Anu",10,20,30);
		ob1.dis();
		int s1=ob1.mark1+ob1.mark2+ob1.mark3;
		Student ob2=new Student();
		ob2.read(2,"JOE",50,80,30);
		ob2.dis();
		int s2=ob2.mark1+ob2.mark2+ob2.mark3;
		Student ob3=new Student();
		ob3.read(3,"HANNAH",10,10,30);
		ob3.dis();
		int s3=ob3.mark1+ob3.mark2+ob3.mark3;
		if(s1>s2 && s1>s3)
			System.out.println(ob1.name+" "+" has highscore");
		else if(s2>s3)
			System.out.println(ob2.name+" "+" has highscore");
		else
			System.out.println(ob3.name+" "+" has highscore");
			
	}
}
