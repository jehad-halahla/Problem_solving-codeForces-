#include <bits/stdc++.h>
#define FAST cin.tie(0);cin.sync_with_stdio(0);
 
 
using namespace std;
 
int main(){
     FAST
    int t;
    cin >> t;
    while(t--){
        int a[3];
        for(int i = 0  ; i < 3 ; i++){
        cin >> a[i];
        }
 
        int n = sizeof(a) / sizeof(a[0]);
        sort(a,a+n);
 
        cout  << a[1] << "\n";
 
 
    }
    return 0;
}