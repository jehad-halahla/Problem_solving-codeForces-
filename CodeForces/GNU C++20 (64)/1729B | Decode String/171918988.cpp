#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main()
{
    cin.sync_with_stdio(false);
    cin.tie(nullptr);
  int t;
  cin >> t;
  while(t--){
    int n;
    string str;
    string code =  "";
    cin >> n>>str;
    for(int i = n-1 ; i  >= 0 ; i --){
        if((str[i] == '0' && str[i+1] != '0') ||  (i == n-1 && str[i] == '0')){
                string st ="";
                int num = (10*(str[i-2]-'0'))+(str[i-1] - '0');
                code.push_back((char)(num+96));
                i-=2;
        }
          else{
                string st = "";
             code.push_back((char)(str[i]-'1'+'a' ));
          }
 
    }
    for(int i  = code.size()-1 ; i >= 0 ; i-- ){
        cout << code[i]  ;
 
    }
    cout << "\n";
 
 
  }
    return 0;
}