#include <bits/stdc++.h>
using namespace std;
 
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
 int t;
 cin >> t;
 while(t--){
 string str;
 cin >> str;
 int zeroCount = 0;
 int longestZeroSeq =0 ;
 int firstZero =-1;
 for(int i = 0 ;i < str.size() ; i++){
    if(str[i] == '0'){
        zeroCount++;
    }
 }
 for(int i = 0 ;i < str.size() ; i++){
    if(str[i] == '0'){
           firstZero = i;
           break;
    }
 }
if(zeroCount){
        int index = firstZero;
    while(str[index] == '0' && index < str.size()){
        longestZeroSeq++;
       index++;
 
    }
       if(zeroCount != longestZeroSeq)
        cout << 2<<"\n";
      else
        cout << 1<<"\n";
}
else{
    cout<<0<<"\n";
}
 
 
 }
    return 0;
}