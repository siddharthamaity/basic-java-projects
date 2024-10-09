
public class SynchronizationDemo {

	public static void main(String[] args) {
		CallMe ob=new CallMe();
		CallingThread ob1=new CallingThread(ob, "AAAAAAAAAAA");
		CallingThread ob2=new CallingThread(ob, "BBBBBBBBBBB");
		CallingThread ob3=new CallingThread(ob, "CCCCCCCCCCC");
	}

}
