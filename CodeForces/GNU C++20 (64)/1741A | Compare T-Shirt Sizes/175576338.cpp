#include <bits/stdc++.h>
#define FAST cin.sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
 
int main()
{
   FAST
   int t;
   cin >> t;
   while(t--){
    string str1,str2;
    cin >> str1>> str2;
    if(str1[str1.size()-1] == str2[str2.size()-1]){
        if (str1.size() > str2.size() && str1[str1.size()-1] == 'L'){
            cout << ">" << "\n";
        }
            else if (str1.size() > str2.size() && str1[str1.size()-1] == 'S'){
            cout << "<" << "\n";
        }
        else if (str1.size() < str2.size() && str1[str1.size()-1] == 'L'){
            cout << "<" << "\n";
        }
         else if (str1.size() < str2.size() && str1[str1.size()-1] == 'S'){
            cout << ">" << "\n";
        }
        else
            cout << "=" << "\n";
    }
    else{
        if(str1[str1.size()-1] > str2[str2.size()-1])
            cout << "<" << "\n";
        else if(str1[str1.size()-1] < str2[str2.size()-1])
            cout << ">" << "\n";
            else
                cout << "=" << "\n";
    }
 
   }
    return 0;
}