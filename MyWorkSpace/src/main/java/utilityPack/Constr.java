package utilityPack;

class D
{
	public D()
	{
		
	}
	public D(int x)
	{
		System.out.println(x);
	}
}

class C extends D
{
	
	public C(int x)
	{
		super(x);
		System.out.println("Class B constructor");
	}
}
 
public class Constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C(10);
	}

}
