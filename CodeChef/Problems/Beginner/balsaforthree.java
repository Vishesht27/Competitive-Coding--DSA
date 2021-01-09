import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class balsawedsthree {

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
    int m = sc.nextInt();
    for (int i = m + 1; i > 0; i++) {
      int temp = i;
      int c = 0;
      int j;
      for (j = temp; j > 0; j = j / 10) {
        if (j % 10 == 3) c++;
      }
      if (c >= 3) {
        System.out.println(i);
        break;
      }
    }
  }
}
}
