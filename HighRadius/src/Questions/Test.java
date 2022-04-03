package Questions;

public class Test {
	{
		System.out.println("Object created");
	}
	public static void main(String[] args) {
      
		Test2 t2=new Test2();
		//t.m1(new Test());
		//t.m2(new Test());
		Test t=new Test();
		t2.m1(t);
		t2.m2(t);
	}

}

class Test2{
	public void m1(Test t) {
		System.out.println("Test First method");
	}
	public void m2(Test t)
	{
		System.out.println("Test Second Method");
	}
}