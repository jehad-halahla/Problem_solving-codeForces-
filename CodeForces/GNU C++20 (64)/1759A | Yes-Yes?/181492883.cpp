#include <bits/stdc++.h>
 
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main(){
   FAST
   int t;
   cin >> t;
   while(t--){
        string str;
        cin >> str;
   string yes = "";
   for(int i =0  ;i < 20 ;  i ++){
    yes +="Yes";
   }
   int ind = yes.find(str);
   if(ind != -1)
    cout  << "YES"<< "\n";
   else
    cout << "NO" << "\n";
        }
    return 0;
   }
 
 