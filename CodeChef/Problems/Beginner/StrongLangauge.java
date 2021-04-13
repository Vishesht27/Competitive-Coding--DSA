import java.io.*;
import java.util.*;

class StrongLanguage {

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
    while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.nextLine();
        int count = 0;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                count++;
                if(count>max){
                    max = count;
                }
            }else
            count = 0;
        }
        if(max>=k){
            sb.append("YES");
        }else{
            sb.append("NO");
        }
        System.out.println(sb);
    }
  }
}
