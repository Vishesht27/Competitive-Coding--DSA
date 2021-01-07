import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class cardsforfriends {

  static class FastReader {

    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int t = sc.nextInt();
    while (t-- > 0) {
      int w = sc.nextInt();
      int h = sc.nextInt();
      int n = sc.nextInt();
      int count = 1;
       while(w%2==0){
         w=w/2;
         count=count*2;
       }while(h%2==0){
        h=h/2;
        count=count*2;
       }
       if(count>=n){
       System.out.println("YES");
       }else{
       System.out.println("NO");
       }
      }
    }
  }
 
