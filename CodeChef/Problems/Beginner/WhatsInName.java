import java.io.*;
import java.util.*;

class whatsName {

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
            String s = sc.nextLine();
          String arr[] = s.split(" ");

          if (arr.length == 1) {
            String FirstCH = arr[0].substring(0, 1).toUpperCase();
            String RestStr = arr[0].substring(1).toLowerCase();

            System.out.println(FirstCH + RestStr);
          } else {
            //String s;
            for (int i = 0; i < arr.length - 1; i++) {
              String FirstCH = arr[i].substring(0, 1).toUpperCase();

              System.out.print(FirstCH + ". ");
            }
            String FirstCH = arr[arr.length - 1].substring(0, 1).toUpperCase();
            String RestStr = arr[arr.length - 1].substring(1).toLowerCase();
            System.out.println(FirstCH + RestStr);
          }
        }
      }
    }
