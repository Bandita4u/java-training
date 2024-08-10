class J
{
	public static void main(String[] args)
	{
		System.out.println("INSTANCE");
		K obj1=new K();
		obj1.m4();
	}
}
class K
{
	public void m4()
	{
		System.out.println("non-static");
	}
}