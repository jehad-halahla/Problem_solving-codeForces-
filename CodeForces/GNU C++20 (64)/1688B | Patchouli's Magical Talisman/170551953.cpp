#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
 int t;
 cin >> t;
 while(t--){
 int n ;
 cin >> n;
 vector<int> a(n);
 int evenCount =0 ;
 
 cin >> a[0];
 if(a[0]%2 == 0){
    evenCount++;
 }
 
 int minDiv = __builtin_ctz(a[0]);
 for(int i = 1 ; i < n ; i++){
        cin >> a[i];
         if((a[i]%2 == 0)){
              minDiv = min(minDiv,__builtin_ctz(a[i]));
                evenCount++;
         }
 
    }
    if(evenCount != n)
   cout << evenCount<< "\n";
   else
    cout << evenCount + minDiv - 1<< "\n";
 
 }
    return 0;
}