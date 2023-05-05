#include <bits/stdc++.h>
using namespace std;
 
int main()
{
 int n;
  cin >> n;
  if(n == 1)
    cout << 3;
  else if(n== 2)
  cout << 5;
  else{
    cout << 4*(n/3) + 3 + n%3;
  }
 
return 0;
        }
 
 
 