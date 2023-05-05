#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    string str;
    int t;
    cin >> t;
    while(t--){
         int n;
    cin >> n >> str ;
    for(auto &i : str){
        if(i == 'U'){
            i = 'D';
        }
        else if (i == 'D'){
            i = 'U';
        }
    }
    cout << str << "\n";
    }
 
    return 0;
}