import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
		while(T>0){
            int N=sc.nextInt();
		    String S=sc.next();
		    T--;
		    int count=0;
		    boolean visited=false; //mark true if '0' appears;
		for(int i=0;i<N;i++){
		    if(S.charAt(i)=='0'){
		        visited=true; 
		    }
		     //condition true if 1 appears after 0 and visited=true;
		    if(S.charAt(i)=='1' && visited){ 
		        count++; //count increments
		    }
		

		}
			System.out.println(count);
	}

}
}
