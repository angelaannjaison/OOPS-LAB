/*16. Create classes Student and Sports. 
Create another class Result inherited from Student and Sports. 
Display the academic and sports score of a student.*/

import java.util.*;

interface Student
{
	void disp1();
}

interface Sports
{
	int sports_mark=19;
	void disp2();
}

class Result implements Student,Sports
{
	String n;
	int rn;
	int m;
	
	public void disp1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student's name :");
		n=sc.nextLine();
		System.out.println("Enter the Roll number :");
		rn=sc.nextInt();
		System.out.println("Enter the Marks scored :");
		m=sc.nextInt();		
	}


	public void disp2()
	{
		Scanner sc=new Scanner(System.in);
		int total=m + sports_mark;
		System.out.println("\tSports Score   :"+sports_mark);
		System.out.println("\tAcademic Score :"+ total);
	}
	void disp()
	{
		System.out.println("\n\t--------DISPLAYING RESULTS----------");
		System.out.println("\tName           : "+n);
		System.out.println("\tRoll number    :"+rn);
		System.out.println("\tMark Scored    :"+m);	
	}
}
 
class Interface_16
{
	public static void main(String[] args)
	{
		Result r=new Result();
		r.disp1();
		r.disp();
		r.disp2();
	}
}





