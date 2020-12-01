#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    ll n;
    cin>>n;
    ll counter = 0;
    int i = 1;
    while(n/pow(5,i)>0)
    {
        counter += n/(pow(5,i));
        i++;
    }
    cout<<counter;
    return 0;
}
