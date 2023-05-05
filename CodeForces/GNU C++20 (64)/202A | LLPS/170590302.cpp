#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
   string str ;
   cin >> str ;
   int count = 0;
   char max = str[0];
   for(int i = 0 ; i < str.size(); i++){
        if(str[i] > max)
            max = str[i];
   }
 
 
   for(int i = 0 ; i < str.size() ; i++){
    if (str[i] == max)
        count++;
   }
 
   for(int i = 0 ; i < count ; i++){
 
    cout << max;
   }
   cout << "\n";
     return 0;
}