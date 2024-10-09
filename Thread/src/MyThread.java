
public class MyThread extends Thread {
	int count;
	int sleep;
	MyThread(String a,int b,int c)
	{
		this.setName(a);
		this.count=b;
		this.sleep=c;
	}
	public void run()
	{
		System.out.println("Thread "+this.getName()+" started.");
		while(count>0)
		{
			System.out.println("I'm THREAD "+this.getName()+". I am "+sleep+" seconds lazy:-) I have "+count+" seconds more...");
			try {
				Thread.sleep(sleep*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
		}
		System.out.println("Thread "+this.getName()+" died!");
	}
}
