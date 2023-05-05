#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false);cin.tie(0);
using namespace std;
 
int main()
{
    FAST
    int t;
    cin >> t;
    while(t--){
    int n,m;
    cin >> n >> m ;
    for(int i = 0; i < n ; i++){
        for(int j =0 ; j  <  m ; j++){
         if(i == 0 && j == 0)
            cout << 'W' ;
            else
            cout << 'B';
        }
        cout << "\n";
    }
 
 
    }
     return 0;
}