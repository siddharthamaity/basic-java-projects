
public class Test {

	public static void main(String[] args) {
		Finalize ob=new Finalize();
		ob=null;
		System.gc();
	}

}
