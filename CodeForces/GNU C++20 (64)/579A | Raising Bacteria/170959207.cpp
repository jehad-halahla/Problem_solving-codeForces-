#include <bits/stdc++.h>
using namespace std;
 
int main()
{
 int n;
 cin >> n;
 int counter =0 ;
 while(n){
    if(n&1)counter++;
    n>>=1;
 }
 cout << counter;
 
return 0;
        }
 
 
 