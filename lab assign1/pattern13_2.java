class pattern13_2{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=6;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=6;i++)
		{
			for(int k=6;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}