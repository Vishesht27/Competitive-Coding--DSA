import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int sum=x+y;
		    int s1=0;
		    for(int i=1;i<=40;i++){
		        if(isPrime(sum+i)){
		            s1=i;
		            break;
		        }
		    }
		    System.out.println(s1);
		}
	}

	public static boolean isPrime(int n){
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	         return false;
	        }
	    }
	    return true;
	}
}
