import java.util.*;
class String_menu
{
	void countwords(String s)
	{
		String[] arr1=s.split(" ");
    		int count=0;
		for(int i=0;i<arr1.length; i++)
	 	{	
			count=0;
			for(int j=0;j<arr1.length;j++) 
			{
            			String temp=arr1[j];
            			String temp1=arr1[i];
				if(j<i && temp.contentEquals(temp1)) 
				{
                			break;
				}
               			if(temp.contentEquals(temp1)) 
				{
                			count=count+1;
				}
				if(j==arr1.length-1) 
				{
                			System.out.println("occurance of-----> "+arr1[i]+"\t"+ count);
				}
			}
		}
	}
	void replace(String s)
	{
		Scanner ob=new Scanner(System.in);
		String[] arr1=s.split(" ");
		System.out.print("Enter the new word:");
		String new_word=ob.next();
		System.out.print("Enter the old word:");
		String old_word=ob.next();
		String snt="";	
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i].compareTo(old_word)==0)
			{
				arr1[i]=new_word;
			}
			snt=snt+arr1[i]+" ";
		}
		System.out.println("After replacing-----:"+snt);
	}
	void reverse(String s)
	{
		String[] arr1=s.split(" ");
		System.out.println("----Original sentance----:"+"\t"+s);
		System.out.println("--------Reversed sentance----:"+"\t");
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the sentance::");
		String s=ob.nextLine();
		String_menu obj=new String_menu();
		
		do{
			System.out.println("Enter 1.count 2.Replace 3.Reverse 4.Exit:");
			c=ob.nextInt();
			switch(c)
			{
				case 1:obj.countwords(s);
					break;
				case 2:obj.replace(s);
					break;
				case 3:obj.reverse(s);
					break;
				case 4:System.out.println("Successfully Terminated");
					break;
				default:System.out.println("Invalid choice!!!");
			}
		}while(c>4);
	}
}
			
		