#include<iostream>
using namespace std;

void reverse(string s){
    if(s.length()==0){
        return;
    }
string r  = s.substr(1);
reverse(r);
cout<<s[0];
}
int main(){
 reverse("vishesh");
    return 0;
}
