#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t ;
    cin >> t;
    while(t--)
    {
 
       int n,m;
       cin>>n>>m;
       int a[n][m];
       for(int i =0 ; i < n ; i++){
            for(int j = 0 ; j < m;j++){
                if(j%4 == 0 || j%4 == 3){
                    if(i%4 == 0 || i%4 == 3){
                        a[i][j] = 1;
                    }
                    else
                        a[i][j] = 0;
                }
                else{
                      if(i%4 == 0 || i%4 == 3){
                        a[i][j] = 0;
                    }
                    else
                        a[i][j] = 1;
                }
                }
            }
            for(int i = 0 ; i < n ; i++){
                for(int j = 0; j < m ; j++){
                    cout << a[i][j] << " ";
                }
                cout << "\n";
            }
 
 
        }
    return 0;
        }
 
 
 