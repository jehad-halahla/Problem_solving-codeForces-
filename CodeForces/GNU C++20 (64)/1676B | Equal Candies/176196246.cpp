#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main()
{
   FAST
   int t;
   cin >> t;
   while(t--){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0 ;i  < n ;i++)
        cin >> arr[i];
    sort(arr,arr + n);
    int sum = 0;
    for(int i = 1 ; i < n; i++)
    sum+= (arr[i]-arr[0]);
    cout << sum << "\n";
    }
    return 0;
}