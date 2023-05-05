#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t ;
    cin >> t;
    while(t--){
    map<string,int>mapp;
    int n;
    cin >> n;
    string arr[3][n];
    for(int i = 0; i < 3; i++ ){
        for(int j = 0 ;j < n ; j++){
        cin >> arr[i][j];
        mapp[arr[i][j]]++;
        }
    }
    for(int i = 0 ; i < 3 ; i++){
                int total = 0 ;
          for(int j = 0 ; j < n ; j++){
        if(mapp[arr[i][j]] == 2)total++;
            else if(mapp[arr[i][j]] == 1)total+=3;
    }
    cout << total << " ";
    }
    cout << "\n";
 
    }
     return 0;
}