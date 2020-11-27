#include<iostream>
using namespace std;
 void tower(int n,char src,char dest,char help){
     if(n==0){
         return;
     }
     tower(n-1,src,help,dest);
         cout<<"Move from"<<src<<" to "<<help<<endl;
         tower(n-1,help,dest,src);


     }


 int main(){
 tower(3,'A','C','B');

return 0;
 }
