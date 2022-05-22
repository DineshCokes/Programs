
public class Square 
{
	public static void square(int k,int l)
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=l;j++)
			{
				if(i==1||i==k||j==1||j==l)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		int a=10;
		int b=10;
		square(a,b);
		
	}

}
