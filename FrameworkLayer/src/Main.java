
public class Main {

	public static void main(String args[])
	{
		Interface1 i1 = new ConcreteClass1();
		
		AbstractDemo ab = (AbstractDemo)i1;
		
		ConcreteClass1 c = (ConcreteClass1)ab;
		
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		c.method6();
	}
}
