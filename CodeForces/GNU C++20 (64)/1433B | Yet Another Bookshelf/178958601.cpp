#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main()
{
  FAST
  int t;
  cin >> t;
    for(int i = 0 ; i < t ; i ++){//doesn't count in comlexity
        int n;
        cin >> n;
        int arr[n];
        for(int j = 0 ; j < n ; j++)//On
            cin >> arr[j];
            int l=-1;
            int r=-1;
            for(int j =0 ; j < n ; j++){//On
                if(arr[j] == 1){
                    l = j;
 
                    break;
 
                }
            }
            for(int j = n-1 ; j >= 0 ; j--){//On
                 if(arr[j] == 1){
                    r = j;
                    break;
                }
            }
            int ans=0;
                if(l != r){
                       for(int k=l;k<r;k++){//worst case On
                    if (arr[k]==0){
                        ans++;
                    }
                }
                }
             cout << ans << "\n";
 
 
 
    }
 return 0 ;
 
}