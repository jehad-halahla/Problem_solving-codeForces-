#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    long long row,coloumn;
    cin >>row>>coloumn;
    if(coloumn ==1){
        cout << row-1;
    }
    else{
        cout << (coloumn-1)*row;
    }
return 0;
        }
 
 
 