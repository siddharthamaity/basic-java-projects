
public class ExceptionHandling {
	
	public static void main(String args[]){
		int b=1;
		int a[]=new int[5];
		String str=null;
		try{
			int temp=5/b;
			a[8]=1;
			System.out.println("Try Block");
		}
		catch(RuntimeException e){
			System.out.println("Divide by 0 not allowed.");
		}
		//catch( e){
			//System.out.println("Array index out of bound.");
		//}
		finally{
			System.out.println("Finally Block");
		}
		
		System.out.println("After Try Catch");
	}
}
