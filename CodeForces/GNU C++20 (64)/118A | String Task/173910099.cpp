#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
    string str ;
     cin >> str;
     int s = str.size();
     for(int i =0 ; i < s ; i++){
        str[i] = tolower(str[i]);
        if(str[i] == 'a' || str[i] == 'o' ||str[i] == 'i' ||str[i] == 'u' ||str[i] == 'e' ||str[i] == 'y'){
            str.erase(i,1);
        i--;
 
        }
     }
     int s2 = str.size();
     for(int i = 0 ; i < s2 ; i++){
        if(i%2 == 0){
            str.insert(i,".");
            s2++;
        }
     }
     cout << str;
    return 0;
}