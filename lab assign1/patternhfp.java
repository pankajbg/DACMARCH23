class patternhfp{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(i==6||j==1||j==(2*i-1))
				{
					System.out.print("*");
				}
			   else
			   {
				System.out.print(" ");
			   }
			}
			
			System.out.println();
			
		}
	}
}