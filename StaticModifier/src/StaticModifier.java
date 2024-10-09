
public class StaticModifier {
	// Static block
	static{
		System.out.println("Static Block");
	}
	
	public static int i;
	
	// Constructor
	StaticModifier(){
		System.out.println("Constructor");
	}
	
	public void seti(int a){
		i=a;
	}
}
