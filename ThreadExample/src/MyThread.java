
public class MyThread extends Thread {
	public MyThread(String name){
		this.setName("My Thread");
		start();
	}
	
	public void run(){
		System.out.println(this);
	}
}
