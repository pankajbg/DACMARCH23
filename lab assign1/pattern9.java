class pattern9{
	public static void main(String agrs[])
	{
		int alpha=64;
		for(int i=1;i <=5;i++)
		{
			for(int k=1;k<=4;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+ " ");
			}
	     System.out.println();
		}
	}
}