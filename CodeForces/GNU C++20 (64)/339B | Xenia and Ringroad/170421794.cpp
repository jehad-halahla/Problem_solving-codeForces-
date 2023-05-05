#include <bits/stdc++.h>
#define REP(i,a,b) for(int i = a ; i < b ; i++)
typedef long long ll;
using namespace std;
 
int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n,m;
    ll counter = 0;
    cin>>n>>m;
    vector<int> v(m);
    for(int i = 0 ; i < m ; i++)
        cin >> v[i];
    for(int i = 0; i < m-1 ;i++){
            if(i ==0)
            counter+=v[i]-1;
        if(v[i] <= v[i+1])
            counter+= (v[i+1] - v[i]);
        else
            counter += (n-v[i] + v[i+1]);
    }
    cout<<counter;
}
 