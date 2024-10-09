import java.util.Scanner;


public class AdderTest {

	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE OF ARRAY");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		int b[]=new int [size];
		int c[]=new int [size];
		System.out.println("ENTER THE ELEMENTS OF THE 1ST ARRAY");
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("ENTER THE ELEMENTS OF THE 2ND ARRAY");
		for(int i=0;i<size;i++)
		{
			 b[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<size;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		Adder ob[]=new Adder[size];
		for(int i=0;i<size;i++){
			ob[i]=new Adder(a,b,c,i);
			ob[i].start();
			
		}
	
		System.out.println();
		
		for(int i=0;i<size;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
