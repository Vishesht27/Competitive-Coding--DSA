#include<iostream>
using namespace std;
 string removedupli(string s){
if(s.length()==0){
    return "";
}
 char ch=s[0];
 string ans=removedupli(s.substr(1));
 if(ch==ans[0]){
     return ans;
 }return ch+ans;

 }

 int main(){
     cout<<removedupli("aaaaabsghssjjsjsjjsnxs");
     return 0;
 }
