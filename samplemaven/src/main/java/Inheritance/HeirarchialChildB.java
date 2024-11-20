package Inheritance;

public class HeirarchialChildB extends HeirarchialParentA {
public void display1()
{
	System.out.println("Child class B");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChildB obj=new HeirarchialChildB();
		obj.display();
		obj.display1();
	}

}
