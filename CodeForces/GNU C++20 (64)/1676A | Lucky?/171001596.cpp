#include <bits/stdc++.h>
#include <string>
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t ;
    cin >> t;
    while(t--){
    string str;
    cin >> str;
    int sum1 = str[0] + str[1] + str[2];
    int sum2 = str[3] + str[4] + str[5];
    if(sum1 == sum2)
        cout << "YES" << "\n";
    else
        cout << "NO" << "\n";
 
    }
 
    return 0;
}
 
 
 