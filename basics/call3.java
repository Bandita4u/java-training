class F
{
	public static void m2()
	{
		System.out.println("Execution starts");
	}
}

class H
{
	public static void main(String[] args)
	{
		F.m2();
		System.out.println("Execution ends");
	}
}