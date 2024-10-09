import java.util.Scanner;

public class TestMatrixMulti {

	public static void main(String[] args) {
		int row1,col1,row2,col2;
		System.out.println("ENTER THE ROW NUMBER OF 1ST MATRIX::");
		Scanner sc=new Scanner(System.in);
		row1=sc.nextInt();
		System.out.println("ENTER THE COLUMN NUMBER OF 1ST MATRIX::");
		col1=sc.nextInt();
		System.out.println("ENTER THE ROW NUMBER OF 2ND MATRIX::");
		row2=sc.nextInt();
		System.out.println("ENTER THE COLUMN NUMBER OF 2ND MATRIX::");
		col2=sc.nextInt();
		if(col1!=row2)
		{
			System.out.println("MATRIX MULTIPLICATION NOT POSSIBLE");
			System.exit(0);
		}
		int[][] m1=new int[row1][col1];
		int[][] m2=new int[row2][col2];
		int[][] m3=new int[row1][col2];
		System.out.println("ENTER THE ELEMENTS OF 1ST MATRIX");
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					m1[i][j]=sc.nextInt();
				}
				System.out.println();
			}
		}
		System.out.println("ENTER THE ELEMENTS OF 2ND MATRIX");
		{
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					m2[i][j]=sc.nextInt();
				}
				System.out.println();
			}
		}
		
		System.out.println("THE 1ST MATRIX");
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					System.out.print(m1[i][j]+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("THE 2ND MATRIX");
		
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					System.out.print(m2[i][j]+" ");
				}
				System.out.println();
			}
		System.out.println(m1.length);
			
		
		Matrixmulti ob[][]=new Matrixmulti[row1][col2];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				ob[i][j]=new Matrixmulti(m1,m2,m3,i,j);
				ob[i][j].start();
				try {
					ob[i][j].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
