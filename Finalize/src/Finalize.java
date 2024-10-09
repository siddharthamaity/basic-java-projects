
public class Finalize {
	Finalize(){
		System.out.println("Constructor");
	}
	
	protected void finalize(){
		System.out.println("Destructor");
	}
}
