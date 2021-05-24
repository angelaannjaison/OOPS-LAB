import java.util.*;
class Symmetric
{
	public static void main(String arg[])
	{
		int r,c,i,j,f=1;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter no rows:");
		r=ob.nextInt();
		System.out.println("Enter no: columns:");
		c=ob.nextInt();
		int mat[][]=new int[r][c];
		int transpose[][]=new int[r][c];
		if(r!=c)
		{
			System.out.println("not Symmetric");
		}
		else
		{
			System.out.println("Enter elements:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					mat[i][j]=ob.nextInt();
				}
			}
			System.out.println("----Matrix elements----");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(mat[i][j]+"\t");
				}
				System.out.println();
			}
			//transpose
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					transpose[j][i]=mat[i][j];
				}
			}
			System.out.println("------Transpose of matrix--------");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(transpose[i][j]+"\t");
				}
				System.out.println();
			}
			
			if(r==c)
			{
				for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
					{
						if(mat[i][j]!=transpose[i][j])
						{
							f=0;
							break;
						}
					}
				}
			}
			if(f==0)
			{
				System.out.println("Not Symmetric");
			}
			else
			{
				System.out.println("Symmetric");
			}
		}

	}
}