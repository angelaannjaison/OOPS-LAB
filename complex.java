public class Complex
{
	int real,imaginary;	
	Complex (int r,int i)
	{
		real=r;
		imaginary=i;
	}
	static Complex sum(Complex c1,Complex c2)
	{
		Complex result=new Complex(0,0);
		result.real=c1.real+c2.real;
		result.imaginary=c1.imaginary+c2.imaginary;
		return result;
	}
	public static void main(String[] args)
	{
		Complex n1=new Complex(2,4);
		Complex n2=new Complex(1,1);
		Complex result=sum(n1,n2);
		System.out.println("SUM OF COMPLEX NUMBER =" + result.real + " " + "+" + " " + "i" + result.imaginary);
	}	
}
