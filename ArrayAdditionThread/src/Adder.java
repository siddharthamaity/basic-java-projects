
public class Adder extends Thread {
	int arr1[],arr2[],arr3[],i;
	Adder(int A[],int B[],int C[],int i)
	{
		this.arr1=A;
		this.arr2=B;
		this.arr3=C;
		this.i=i;
	}
	public void run()
	{
		arr3[i]=arr1[i]+arr2[i];
	}

}
