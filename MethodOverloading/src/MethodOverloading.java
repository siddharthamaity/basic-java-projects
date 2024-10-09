
public class MethodOverloading {

	public static void main(String[] args) {
		func(123);
		func("123");
	}
	
	static void func(int i){
		System.out.println("Int");
	}
	
	static void func(String i){
		System.out.println("string");
	}
}
