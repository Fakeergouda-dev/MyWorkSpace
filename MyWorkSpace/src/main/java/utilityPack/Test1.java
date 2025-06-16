package utilityPack;

class A
{
	public void display(String str)
	{
		System.out.println("in class A "+str);
	}
}

class B extends A
{
	public void display(String st)
	{
		super.display("HELLO");
		System.out.println("in class B "+st);
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display("HAPPY");

	}

}
