#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t ;
    cin >> t ;
    while(t--){
        int n ;
        cin >> n;
        int eights = ceil(n*1.0/4.0);
        for(int i = 0 ; i < n - eights ;i++ ){
            cout <<9;
        }
        for(int i = 0 ; i < eights ; i++){
            cout <<8;
        }
        cout <<"\n";
    }
    return 0;
}