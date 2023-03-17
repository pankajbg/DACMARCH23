class pattern16_2{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=1;j--)
			{
				if(j==1 || i==5 || i==j )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
				
				