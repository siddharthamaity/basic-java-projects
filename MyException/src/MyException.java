
public class MyException {

	public static void main(String[] args) {
		try{
			func1(0);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	static void func1(int i) throws ArithmeticException,NullPointerException{
		if(i<0){
			throw new ArithmeticException("I is negative.");
		}
		if(i==0){
			throw new NullPointerException("I is zero.");
		}
	}
}
