#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
#define ll long long
using namespace std;
 
int main()
{
   FAST
 
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0 ;i  < n ;i++)
        cin >> arr[i];
    vector<int>curr;
    int cur = 1;
    for(int i = 0  ; i < n; i++){
        if(arr[i+1] > arr[i] && (i+1) != n)
            cur++;
        else {
            curr.push_back(cur);
            cur = 1;
        }
    }
    sort(curr.begin(),curr.end());
    cout << curr[curr.size()-1] << "\n";
 
    return 0;
}