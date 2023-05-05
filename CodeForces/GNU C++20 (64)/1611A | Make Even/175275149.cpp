#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
 
int main()
{
   FAST
   int t;
   cin >> t;
   while(t--){
    int n;
    cin >> n;
    int num = n ;
    bool isEven = 0 ;
    bool isLastDigit = 0;
    while(n>0){
        if((n%10)%2 == 0){
                if(n<=10)
             isLastDigit = 1;
            isEven = 1;
        }
 
            n /=10;
    }
    if (num%2 == 0 )
         cout << 0 << "\n";
    else if(!isEven)
        cout << -1<< "\n";
    else if (isLastDigit)
        cout << 1 << "\n";
    else if(isEven)
         cout << 2 << "\n";
 
   }
    return 0;
}