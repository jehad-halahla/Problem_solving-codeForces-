#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
int rec(int n);
int main()
{
   FAST
int t;
cin >> t ;
 
while(t--){
    int a , b , c;
    cin >> a >> b >> c;
    if( a + b == c || a + c == b || b + c == a)
        cout << "YES" << "\n";
        else
             cout << "NO" << "\n";
 
}
 return 0 ;
 
}