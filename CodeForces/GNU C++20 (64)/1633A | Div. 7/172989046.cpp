#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
  int t;
  cin >> t;
  while(t--){
    int n ;
    cin  >> n ;
    if(n%7 == 0 )
        cout << n << "\n";
    else{
        int res = -1;
    for(int i = 0 ; i < 10 ; i++){
        if((n - (n%10) + i)%7 == 0){
            res  = n - (n%10) + i;
                }
            }
            cout << res << "\n";
        }
    }
    return 0;
}