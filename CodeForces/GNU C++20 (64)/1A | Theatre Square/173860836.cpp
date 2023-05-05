#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    long long n,m,a;
    cin >> n >> m >> a;
    cout << (((n-1)/a)+1)*(((m-1)/a)+1);
    return 0;
}