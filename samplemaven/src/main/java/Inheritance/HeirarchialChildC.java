package Inheritance;

public class HeirarchialChildC extends HeirarchialParentA {
	public void display2()
	{
		System.out.println("Child class C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChildC obj=new HeirarchialChildC();
		obj.display();
		obj.display2();
	}

}
