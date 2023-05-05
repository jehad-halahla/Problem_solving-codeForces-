#include <bits/stdc++.h>
#define REP(i,a,b) for(int i = a ; i < b ; i++)
typedef long long ll;
using namespace std;
 
int main()
{
   int t;
   cin>>t;
  while(t--){
     int n,m;
     int res = 0;
     cin>>n>>m;
    vector<int>piles(n);
     for(int i = 0 ; i < n ; i++){
            cin>>piles[i];
     }
    int minimum,maximum;
    minimum = maximum = piles[0];
     for(int i = 1 ; i < n ; i++){
        if(piles[i] < minimum)
            minimum = piles[i];
        if(piles[i] > maximum)
            maximum = piles[i];
        if(maximum  - minimum > 2*m){
            res++;
                 minimum = maximum = piles[i];
 
        }
     }
     cout<< res << "\n";
  }
}
 