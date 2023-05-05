#include <bits/stdc++.h>
#define FAST cin.tie(0);cin.sync_with_stdio(0);
 
 
using namespace std;
 
int main(){
     FAST
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        int b[n];
        int res[n];
        for(int i = 0  ; i < n ; i++){
        cin >> a[i];
        b[i] = a[i];
        }
 
        int size = sizeof(b) / sizeof(b[0]);
        sort(b,b+size);
        int maxIndex = n-1;
        int max = b[maxIndex];
        for(int i = 0 ; i < n ; i++){
        if(a[i] == max)
           res[i] = a[i] - b[maxIndex-1];
           else
           res[i] = a[i] - max;
 
        }
            for(int i = 0 ;i < n ; i++){
            cout  << res[i] << " ";
            }
            cout << "\n";
 
    }
    return 0;
}