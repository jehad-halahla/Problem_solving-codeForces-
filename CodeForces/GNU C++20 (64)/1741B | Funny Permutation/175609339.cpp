#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
 
int main()
{
   FAST
   int t;
   cin >> t;
   while(t--){
        int n;
        cin >> n ;
        vector<int>a;
        if(n == 3){
            cout << -1 << "\n";
        }
        else{
             for(int i = n ; i  > n-2 ; i-- ){
            a.push_back(i);
        }
        for(int i = 1 ; i <= n-2;i++)
            a.push_back(i);
        if(n == 2){
            cout << a[0] << " " << a[1] << "\n";
        }
 
        else{
 
        for(int i = 0  ; i < a.size() ; i++ ){
            cout << a[i] << " ";
        }
        cout << "\n";
        }
 
        }
 
   }
    return 0;
}