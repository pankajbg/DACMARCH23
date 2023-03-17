class patternhihf{
	public static void main(String args[])
	{
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1 ||j==1)
				{
					System.out.print("*");
				}
				else if(i==6)
				{
					System.out.print("*");
				}
				else if((i==j))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
	
					