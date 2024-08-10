class I
{
	public static void main(String[] args)
	{
		System.out.println("non-static");
		I obj1=new I();
		obj1.m3();
	}

	public void m3()
	{
		System.out.println("instance");
	}
}