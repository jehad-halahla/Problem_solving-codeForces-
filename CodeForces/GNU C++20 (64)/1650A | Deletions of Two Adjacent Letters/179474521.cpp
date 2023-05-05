#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false);cin.tie(0);
using namespace std;
 
int main()
{
    FAST
    int t;
    cin >> t;
    while(t--)
    {
        string s,c;
        cin >> s >> c;
        bool isGood = false;
        for(int i = 0 ; i < s.length(); i++)
        {
            if(s[i] ==  c[0] && i%2 == 0)
            {
                isGood = true;
                break;
            }
        }
        cout  << (isGood? "YES":"NO") << "\n";
    }
 
 
    return 0;
}