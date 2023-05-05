#include <iostream>
 
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >> t;
    while(t--){
        int a,b,n;
        cin >> a >> b >> n;
        int counter = 0 ;
        while(!(max(a,b) > n)){
            if(a > b)
                b+=a;
            else
                a+=b;
            counter++;
        }
        cout << counter << "\n";
    }
 
    return 0;
}