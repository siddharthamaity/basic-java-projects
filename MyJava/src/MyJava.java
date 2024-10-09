import java.util.Date;


public class MyJava {

	
	public static void main(String[] args) {
		Date dt=new Date();
		//System.out.println(dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());
		int h=dt.getHours();
		if(h>=0 && h<12)
		{
			System.out.println("GOOD MORNING");
		}
		else if(h==12)
		{
			System.out.println("GOOD NOON");
			
		}
		else if(h>12 && h<16)
		{
			System.out.println("GOOD AFTERNOON");
		}
		if(h>16 && h<18)
		{
			System.out.println("GOOD EVENING");
		}
		else if(h>18 && h<24)
		{
			System.out.println("GOOD NIGHT");
		}
		
		
	}

}
