import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Restore{
static int maxN=4000001;
static ArrayList<Integer>primes;
static boolean prime[]=new boolean[maxN];

public static void generateSieve()
{
primes=new ArrayList<>();
for(int i=0;i<maxN;i++)
{
prime[i]=true;
}
for(int p=2;p*p<maxN;p++)
{
if(prime[p])
{
for(int i=p*p;i<maxN;i+=p)
{
prime[i]=false;
}
}
}
for(int i=2;i<maxN;i++)
{
if(prime[i])
primes.add(i);
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
generateSieve();

while(t-- >0)
{
int n=sc.nextInt();
int b[]=new int[n];
ArrayList<Integer>a=new ArrayList<>();
HashMap<Integer,Integer>map=new HashMap<>();

for(int i=0;i<n;i++)
{
b[i]=sc.nextInt();
map.put(b[i],map.getOrDefault(b[i],0)+1);
}

for(int i=0;i<n;i++)
{
a.add(primes.get(b[i]));
map.put(b[i],map.get(b[i])-1);
}
for(int i:a)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}
