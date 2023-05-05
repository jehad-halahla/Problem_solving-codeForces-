#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >> t;
    while(t--)
    {
        int a,b;
//known theorem
        cin >> a >> b;
        int xorOfA;
        if(a%4 == 1)xorOfA = a-1;
        else if(a%4 == 2)xorOfA = 1;
        else if(a%4 == 3)xorOfA = a;
        else xorOfA = 0;
        if(xorOfA == b)cout << a << "\n";
        else if((xorOfA^b) != a )cout << a+1 << "\n";
        else cout << a+2 << "\n";
    }
 
    return 0;
}
 
 
 