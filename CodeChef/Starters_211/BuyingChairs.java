import java.util.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		    T--;
		int W=sc.nextInt();
		int P=sc.nextInt();
		int K=sc.nextInt();
		
		int stylishness;
		if(K<=W){
		    stylishness=2*K;
		}
		else{
		    stylishness= 2*W + (1*(K-W));
		}
		System.out.println(stylishness);
	}

	}
}
