#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main()
{
   FAST
   int t;
   cin >> t;
   while(t--){
    int n;
    cin >> n;
    int div;
    if(n >= 1900)
        div = 1;
    else if(n >=1600 && n <= 1899)
        div = 2;
    else if (n >= 1400 && n <= 1599)
        div = 3 ;
    else
        div = 4;
    cout << "Division " << div << "\n";
    }
    return 0;
}