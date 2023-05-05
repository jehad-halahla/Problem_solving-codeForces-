#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main()
{
   FAST
 
 
        int n;
        cin >> n;
        int odd = 1 ;
        int even = 2 ;
        if(n%2 != 0)
            cout << -1 << "\n";
            else {
                 for(int i = 0 ; i < n/2; i++){
            cout << even << " " << odd << " ";
            even += 2 ;
            odd +=2 ;
    }
            }
 
    return 0;
}