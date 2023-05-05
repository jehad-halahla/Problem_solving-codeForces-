#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
 int t;
 cin >> t;
 while(t--){
 int n,z;
 cin >> n >> z;
 vector<int> a(n);
 for(int i = 0 ;i < n ;i++)
    cin >> a[i];
    a[0] = a[0]|z;
    int maxi = a[0];
  for(int i = 1 ;i < n ;i++){
      a[i] = a[i]|z;
      maxi = max(maxi,a[i]);
  }
        cout << maxi << "\n";
 }
    return 0;
}