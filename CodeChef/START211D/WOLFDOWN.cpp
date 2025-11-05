#include <iostream>
using namespace std;

int main() {

	int T;
	cin>>T;
	
	while(T--){
	    int total;string st;
	    
	    cin>>total>>st;
	    int ans = 0;
	    for(int i=0;i<st.size();i++){
	        if(st[i]=='1')
	            break;
	            
	       ans++;
	    }
	    
	    cout<<ans<<endl;
	}

}