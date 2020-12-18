import java.util.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    if(n==1){
		        System.out.println("no");
		    }
		    else{
		        int f=0;
		    for(int i=2;i<n;i++){
		        if(n%i==0){
		            f=1;
		            break;
		        }
		    }
		     if(f==1){
		        System.out.println("no");
		    }
		    else{
		        System.out.println("yes");
		    }
		    }

		}
	}
}
