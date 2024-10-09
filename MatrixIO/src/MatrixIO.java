import java.util.Scanner;


public class MatrixIO {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER ROW & COLOUMN NUMBER : ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	// 2D array creation
	int mat1[][]=new int[row][col];
	int mat2[][]=new int[row][col];
	int mat3[][]=new int[row][col];
	System.out.println("ENTER THE VALUES OF 1ST MATRIX::");
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			mat1[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(mat1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("ENTER THE VALUES OF 2ND MATRIX::");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			mat2[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(mat2[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			mat3[i][j]=mat1[i][j]+mat2[i][j];
		}
	}
	System.out.println();
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			
			System.out.print(mat3[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}
