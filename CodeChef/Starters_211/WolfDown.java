
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
		    T--;
		int N=sc.nextInt();
		String S=sc.next();
		
		int bird_eaten=0;
		int bird_total=0;
		char[] arr=S.toCharArray();
		
		for(int i=0;i<N;i++){
		    if(arr[i]=='0'){
		        bird_total++;
		    }
		}
		for(int i=0;i<N-1;i++){
		    if(arr[i]=='1'){
		        int j=i+1;
		        while(j<N  && arr[j]=='0'){
		        bird_eaten++;
		        j++;
		        }
		        
		    }
		}
		int safe= bird_total - bird_eaten;
		System.out.println(safe);
		
		
		}
		
	}
}
