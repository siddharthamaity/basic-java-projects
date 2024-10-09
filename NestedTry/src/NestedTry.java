
public class NestedTry {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		try{
			int b=5/1;
			try{
				a[4]=8;
				try{
					int c=10/0;
				}
				catch(NullPointerException e){
					System.out.println("Catch 1");
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Catch 2");
			}
		}
		catch(ArithmeticException e){
			System.out.println("Catch 3");
		}
	}

}
