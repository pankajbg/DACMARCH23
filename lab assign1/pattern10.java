class pattern10{
	public static void main(String agrs[])
	{
		for(char i='E';i>='A';i--)
		{
			for(char k=i;k>='A';k--)
			{
				System.out.print(" ");
			}
			for(char j=i;j<='E';j++)
			{
				System.out.print(j+" ");
			}
	     System.out.println();
		}
	}
}