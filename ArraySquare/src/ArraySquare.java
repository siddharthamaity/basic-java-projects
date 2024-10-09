import java.util.Scanner;

public class ArraySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A INTEGER NUMBER::");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr2[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=i*i;	
		}
		
		for(int i=0;i<size/2;i++){
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		
		/*for(int j=0;j<3;j++)
		{
			arr2[j]=arr[j];
			System.out.print(arr2[j]+" ");
		}*/
		
		System.arraycopy(arr, 0, arr2, 0, 3);
		
		for(int i=0;i<3;i++){
			System.out.print(arr2[0]+"   ");
		}
		
		
		
	}

}
