#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--){
        int n ;
        cin >> n;
        vector<int>a(n);
        for(int i = 0 ; i < n;i++ )
            cin >> a[i];
        int res = a[0];
        for(int i = 1 ; i < n ; i++)
            res &= a[i];
         cout << res << "\n";
    }
 
     return 0;
}