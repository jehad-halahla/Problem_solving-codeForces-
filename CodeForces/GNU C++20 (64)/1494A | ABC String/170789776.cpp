#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t ;
    cin >> t;
    while(t--){
 
        string str ;
        cin >> str;
        char end =  str[str.size()-1];
        char start = str[0];
        int countStart = 1;
        int countEnd = 1;
        int rem = 0;
        if(start == end)
            cout << "NO" << "\n";
        else{
            for(int i =1 ; i < str.size()-1;i++){
            if(str[i] == start)
                countStart++;
            else if(str[i]== end)
                countEnd++;
                else
                rem++;
        }
         bool isValid = true;
            if(countEnd > countStart){
                int open = 0 ;
                for(int i =0 ;i < str.size(); i++){
                        if(str[i] == end)
                            open--;
                        else
                            open++;
                        if(open  < 0){
                                isValid = false;
                                break;
                }
            }
            if(open == 0 && isValid)
            cout <<"YES"<<"\n";
            else
                cout <<"NO"<<"\n";
 
        }
        else{
                 int open = 0 ;
                for(int i =0 ;i < str.size(); i++){
                        if(str[i] == start)
                            open++;
                        else
                            open--;
                        if(open  < 0){
                                isValid = false;
                                break;
                }
            }
            if(open == 0 && isValid)
            cout <<"YES"<<"\n";
            else
                cout <<"NO"<<"\n";
 
        }
 
        }
    }
     return 0;
}