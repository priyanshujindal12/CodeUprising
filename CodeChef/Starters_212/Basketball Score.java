import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int calculate_X= X*3;  //multiply X*3
		int calculate_Y=Y*2;   //multiply Y*3
		int sum= calculate_X+calculate_Y;  //Then sum both we'll get total_score;
	    System.out.print(sum);
		sc.close();
	}
}
