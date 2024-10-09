
public class test {

	public static void main(String[] args) {
		MyThread ob=new MyThread("t1",10,2);
		MyThread ob1=new MyThread("t2",20,1);
		ob.start();
		ob1.start();
		
		/*while(true)
		{
			System.out.println("Thread "+ob.getName()+((ob.isAlive())? " is alive.":" is dead!"));
			System.out.println("Thread "+ob1.getName()+((ob1.isAlive())? " is alive.":" is dead!"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		// TODO Auto-generated method stub
	}

}
