import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class calculator {

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
public static void main(String[] args){
    FastReader sc = new FastReader();
    double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.next().charAt(0);
		double result=0;
		if(c=='+')
		result=a+b;
		if(c=='-')
		result=a-b;
		if(c=='*')
		result=a*b;
		if(c=='/')
		result=a/b;
		System.out.println(result);


}
}
