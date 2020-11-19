import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    for(int k=0; k<t; k++){
		        long a = sc.nextInt();
                long b = sc.nextInt();
                long gcd = gcd(a,b);
                long lcm = (a*b)/gcd;
                System.out.println(gcd + " " + lcm);
		    }
		}catch(Exception e){
		    return;
		}
	}

	    public static long gcd(long a, long b){
            if(b == 0){
                return a;
            }
            return gcd(b,a%b);
        }
}
