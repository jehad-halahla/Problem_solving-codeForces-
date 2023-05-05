#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main(){
   FAST
   int t;
   cin >> t;
   while(t--){
    int m,s;
    cin >> m >> s;
    int max = 0;
    ll sum = 0 ;
 
    for(int i = 0;  i <  m ; i ++){
            int x;
            cin >> x;
            if(x > max)
            max = x;
            sum+=x;
           
    }
     bool isGood = false;
    ll totalSum = max*(max+1)/2;
    ll diff = totalSum - sum;
    if(diff == s){
         isGood = true;
    }
        else{
                 s-= diff;
            int i = max + 1 ;
            for(int ii = i ; ii <= 1000 ; ii++){
               if(s >= ii){
                s -=ii;
                    }
                      if(s == 0){
                           isGood = true;
                           break;
                      }
                 
                }
              
 
            }
            if(isGood)
                cout << "Yes" << "\n";
            else
                cout << "No" << "\n";
   
        }
    return 0;
   }
 
 