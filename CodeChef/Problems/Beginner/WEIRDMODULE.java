import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		if(s.hasNext()){
		    int t=s.nextInt();
		    for(int v=0;v<t;v++){
		        int n=s.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<n;i++){
		            arr[i]=s.nextInt();
		        }
		        Arrays.sort(arr);
		        System.out.println(arr[0]);
		    }
		}
	}
}
