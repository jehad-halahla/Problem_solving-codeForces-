#include <bits/stdc++.h>
#define FAST cin.tie(0);cin.sync_with_stdio(0);
 
 
using namespace std;
 
int main(){
     FAST
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string str;
        cin >> str;
        char max = 'a';
        for(int i = 0 ; i  < n ; i++){
        if(str[i] > max)
        max = str[i];
        }
        int res = max - 'a' + 1;
        cout << res << "\n";
    }
    return 0;
}