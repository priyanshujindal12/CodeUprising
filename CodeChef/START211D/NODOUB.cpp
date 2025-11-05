#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int T;
	cin>>T;
	
	while(T--){
	    int n;
	    cin>>n;
	    vector<int>arr(n,0);
	    for(int i=0;i<n;i++)  cin>>arr[i];

	    sort(arr.begin(), arr.end());

        cout << arr[n-1] << " ";
        for(int i = 0; i < n-1; i++) 
            cout << arr[i] << " ";

	    cout<<endl;
	    
	}

}