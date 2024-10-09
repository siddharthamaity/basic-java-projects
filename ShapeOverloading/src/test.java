
public class test {

	public static void main(String[] args) {
		Shape ob,ob1;
		ob=new Rectangle(10.0,5.0);
		ob1=new Rectangle(20.0,10.0);
		//ob.display();
		//ob1.display();
		System.out.println("Area="+ob.area());
		ob=new Circle(3);
		System.out.println("Area="+ob.area());
		ob.display();
	}

}
