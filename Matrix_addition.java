import java.util.*;
class Matrix_addition
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner ob=new Scanner(System.in);	
		System.out.println("Enter the no: of rows:");
		r=ob.nextInt();
		System.out.println("Enter the no: of columns:");
		c=ob.nextInt();
		int mat1[][]=new int[r][c];
		int mat2[][]=new int[r][c];
		int sum[][]=new int[r][c];
		System.out.println("Enter elements of first matric:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				mat1[i][j]=ob.nextInt();
			}
		}
		System.out.println("Enter elements of second matric:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				mat2[i][j]=ob.nextInt();
			}
		}
		System.out.println("Elements of fst matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Elements of second matrix:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-------Addition-------");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


		