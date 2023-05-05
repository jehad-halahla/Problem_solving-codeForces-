#include <iostream>
#include <vector>
 
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
  int t;
  cin >> t;
  while(t--){
    int a,b,c;
    cin >> a >> b >> c;
 
        int dist1 = abs(a-1) ;
        int dist2 = abs(c-b) + abs(c-1);
        if(dist1 < dist2 )
            cout << 1 << "\n";
        else if (dist2 < dist1)
            cout << 2 <<"\n";
        else
            cout << 3<<"\n";
 
 
  }
    return 0;
}