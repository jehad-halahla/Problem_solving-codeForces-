#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n,d;
    cin >> n >> d;
    long long arr[n];
    for(int i =0 ;i < n ;i++)
        cin >> arr[i];
    sort(arr,arr+n);
   int counter = 0;
   int numberOfCon = 0;
   int index = n-1;
   while(n > numberOfCon && index >= 0){
        if(numberOfCon+(d/arr[index])+1 <= n){
            numberOfCon+=(d/arr[index])+1;
                counter++;
        }
 
 
        index--;
   }
   cout << counter;
 
 
return 0;
        }
 
 
 