#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
 int t;
 cin >> t;
 while(t--){
    int n;
    cin >> n;
    vector<int>sett(n);
    for(int i =0;i <n;i++)
        cin >> sett[i];
    for(int i =0 ; i < n-1;i++){
        sett[i+1] = sett[i]|sett[i+1];
        sett[i] = 0;
    }
    int sum =0;
    for(int i=0 ; i < n;i++){
        sum+=sett[i];
    }
        cout << sum <<"\n";
 }
    return 0;
}