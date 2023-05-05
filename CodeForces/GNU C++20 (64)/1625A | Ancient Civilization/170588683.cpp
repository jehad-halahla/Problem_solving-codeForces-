#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while(t--)
    {
        int n,l;
        cin >> n >> l;
        vector<int> a(n);
        vector<int> number(l);
        for(int i= 0 ; i < n ; i ++)
        {
            cin >> a[i];
        }
        for(int j = l-1; j >=0; j--) //bit mask compare to find if its 1 ;
        {
             int pos_one_count = 0;
            int pos_zero_count = 0 ;
 
            for(int i =0 ; i < n ; i++)
            {
                if(a[i]&(1<<j))
                    pos_one_count++;
                else
                    pos_zero_count++;
            }
        if(pos_one_count > pos_zero_count)
            number[j] = 1;
        else
            number[j] =0;
    }
    int res = 0;
    for(int i = l-1 ; i >= 0 ; i-- ){
        res|=(number[i]<< i);
    }
    cout << res << "\n";
 
    }
     return 0;
}