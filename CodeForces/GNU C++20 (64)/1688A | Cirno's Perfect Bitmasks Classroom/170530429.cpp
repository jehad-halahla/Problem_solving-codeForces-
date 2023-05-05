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
  int w = n&(-n);
  while(!(w^n) || !(w&n))
    w++;
  cout << w << "\n";
 }
    return 0;
}