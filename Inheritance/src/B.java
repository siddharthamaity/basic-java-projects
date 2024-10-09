
public class B extends A {

	public int x,y=10;
	B(int a) {
		super(a);
		System.out.println("Constructor of B");
	}
	
	public void display(){
		System.out.println("Display in B");
	}
}
