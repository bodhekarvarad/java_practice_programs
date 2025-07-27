import java.lang.*;
class User
{
	public static void main(String args[])
	{
		try
		{
			//int a[3]={0,1,2};
			//System.out.println(a[4]);
			int a=10;
			int b=0;
			int res=a/b;
			System.out.println(res);
		}
		catch(Exception R)
		{
			System.out.println(R);
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
}
	