
public class Rectangle extends Shape {
	double width,height;
	
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	public double area()
	{
		return width*height;
	}
	
	public void display()
	{
		System.out.println("Width="+width+","+"Height="+height);
	}
}
