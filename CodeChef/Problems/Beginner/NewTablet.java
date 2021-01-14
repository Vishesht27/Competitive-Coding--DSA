import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class newtablet {

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
      int n = sc.nextInt();
      int b = sc.nextInt();
      int max = 0;
      int br[] = new int[n];
      int he[] = new int[n];
      int pr[] = new int[n];
      for (int i = 0; i < n; i++) {
        br[i] = sc.nextInt();
        he[i] = sc.nextInt();
        pr[i] = sc.nextInt();
        int ratio = br[i] * he[i];
        if (pr[i] <= b && ratio > max) {
          max = ratio;
        }
    }
    if (max == 0) {
      System.out.println("no tablet");
    } else System.out.println(max);
  }
}
}
