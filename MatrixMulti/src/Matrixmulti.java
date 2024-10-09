
public class Matrixmulti extends Thread {
	int mat1[][],mat2[][],mat3[][],i,j;
	Matrixmulti(int a[][],int b[][],int c[][],int i,int j)
	{
		mat1=a;
		mat2=b;
		mat3=c;
		this.i=i;
		this.j=j;
	}
	
	public void run()
	{
		int sum=0;
		for(int k=0;k<mat2.length;k++)
		{
			sum=sum+mat1[i][k]*mat2[k][j];
		}
		mat3[i][j]=sum;
	}
	

}
