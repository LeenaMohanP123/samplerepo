package Inheritance;

public class SingleChild extends SingleParent {

	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.display();
		obj.display1();
		}
	public void display1()
	{
		System.out.println("This is a ChildClass");
	}

}
