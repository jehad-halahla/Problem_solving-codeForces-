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
        int n;
        cin >> n;
        string str ;
        cin >> str;
        long long arr[n];
        if(n == 1)
        {
            cout << 0;
        }
        else
        {
            for(int i = 0 ; i < str.size() ; i++)
            {
                if(str[i] == 'L')
                {
                    int curr = i;
                    long long next = (str.size()-1)-i;
                    arr[i] = next - curr;
                }
                else
                {
                    long long curr = (str.size()-1)-i;
                    long long next = i;
                    arr[i] = next - curr;
                }
            }
                 long long total = 0;
             for(int i = 0 ; i < str.size() ; i++){
                if(str[i] == 'L')
                    total += i;
                else
                    total += str.size()-1-i;
             }
 
 
 
               int s = sizeof arr / sizeof arr[0];
               sort(arr,arr+s);
                for(int i =n-1 ; i >=0 ; i--){
                if(arr[i] > 0)
                    total+=arr[i];
                cout << total << " ";
               }
 
            }
 
 
                cout << "\n";
            }
return 0;
 
 
        }
 
 
 