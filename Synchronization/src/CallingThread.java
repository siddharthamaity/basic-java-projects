
public class CallingThread extends Thread{
	CallMe ob;
	String str;
	
	CallingThread(CallMe o,String s){
		ob=o;
		str=s;
		this.start();
	}
	
	public void run(){
		ob.function(str);
	}
}
