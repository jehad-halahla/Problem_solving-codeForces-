#include <bits/stdc++.h>
using namespace std;
 
int main(){
 int t;
 cin >> t;
 while(t--){
        int n;
 cin>> n;
 
int num =0 ;
while(n != 1){
    n = n>>1;
    num++;
}
for(int i = 0 ; i < num;i++){
    n = ( n << 1 );
}
cout << n-1 << "\n";
 
 
 
 }
    return 0;
}