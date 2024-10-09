
public class CallMe {
	public void function(String str){
		for(int i=0;i<str.length();i++){
			System.out.print(str.substring(i, i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
