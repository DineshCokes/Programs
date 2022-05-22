
public class Transversepyramid 
{
	public static void Transpyramid(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int n=i;n<=a;n++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		int a=7;
		Transpyramid(a);
		
	}

}
