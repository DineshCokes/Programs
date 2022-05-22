
public class Uppertriangle 
{
	public static void main(String args[])
	{
		int k=9;
		for(int i=0;i<=k;i++)
		{
			for(int j=1;j<=k-i;j++)
			{
				System.out.print(" ");
			}
			for(int s=0;s<=i;s++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
