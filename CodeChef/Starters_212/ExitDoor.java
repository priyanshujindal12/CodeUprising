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
		    T--;
		    ArrayList<Integer> P =new ArrayList<>();
		    for(int i=0;i<N;i++){
		        P.add(sc.nextInt());
		    }
		    
		    int left;
		    int right;
		  
		    int total_disturbance=0;
		    //start loop backwards to get the maximum number;
		    for(int i=N;i>0;i--){
		        int index=0;
		        //find the index of max number which has to be removed;
		        index=P.indexOf(i);
		        left=index;
		        //use 'n' to get the right size after 'index' is removed 
		        int n=P.size();
		        right=n-index-1;
		        
		        //if left is min total_disturbance is min;
		        if(left<right){
		            total_disturbance+=left;
		            //remove the index;
		            P.remove(index);
		        }
		        else{
		            total_disturbance+=right;
		             P.remove(index);
		        }
		    }
		   System.out.println(total_disturbance);
		    
		}

	}
}
