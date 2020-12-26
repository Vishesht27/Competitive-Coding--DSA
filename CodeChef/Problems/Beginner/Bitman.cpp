#include<iostream>
using namespace std;

int SetBit(int n,int pos){
    return(n|(1<<pos));
}




int main(){
cout<<SetBit(5,1)<<endl;
    return 0;
}
