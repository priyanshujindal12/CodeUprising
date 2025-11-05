#include <iostream>
using namespace std;

int main() {
    int n;
    
    cin>>n;
    
    while(n--){
        int w,p,total;
        cin>>w>>p>>total;
        
        if(total>=w){
            
            int net = total - w;
            
            cout<< w*2 + net*1<<endl;
        }else{
            cout<< total*2<<endl;
        }
        
    }
}