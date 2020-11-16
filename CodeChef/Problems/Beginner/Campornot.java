import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner sc = new Scanner(System.in);
        int t = 0;
        if (sc.hasNext())
            t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] days = new int[32];
            for (int x = 0; x < n; x++) {
                days[sc.nextInt()] = sc.nextInt();
            }
            for (int x = 1; x < 32; x++) {
                days[x] += days[x - 1];
            }
            int q = sc.nextInt();
            for (int x = 0; x < q; x++) {
                if (days[sc.nextInt()] >= sc.nextInt()) {
                    System.out.println("Go Camp");
                } else {
                    System.out.println("Go Sleep");
                }
            }
        }
	}
}
