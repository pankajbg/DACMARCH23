class PPattern5{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int k=2;k<=i;k++)
			{ 
		     System.out.print(" "+" ");
			}
			for(int j=i;j<=9;j++)
			{
				System.out.print(j+" ");
			}
			for(int j1=8;j1>=i;j1--)
			{
				System.out.print(j1+" ");
			}
			System.out.println();
		}
	}
}
		