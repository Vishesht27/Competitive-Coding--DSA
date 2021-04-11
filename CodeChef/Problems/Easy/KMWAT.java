import java.util.*;
import java.util.Arrays;
class worthMat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();

    while (t-- > 0) {
      int n;
      int m;
      int k;
      n = sc.nextInt();
      m = sc.nextInt();
      k = sc.nextInt();
      int[][] A = new int[n + 1][m + 1];
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          A[i][j] = sc.nextInt();
        }
      }

      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
          A[i][j] += A[i][j - 1];
        }
      }

      for (int j = 1; j <= m; j++) {
        for (int i = 1; i <= n; i++) {
          A[i][j] += A[i - 1][j];
        }
      }
      int ans = 0;

      for (int s = 1; s <= n; s++) {
        for (int i = 1; i <= n - s + 1; i++) {
          int low = 1;
          int high = m - s + 1;
          int mid;
          int p=0;;
          int flag = 0;
          while (low <= high) {
            mid = (low + high) / 2;
            int l =
              A[i + s - 1][mid + s - 1] -
              A[i + s - 1][mid - 1] -
              A[i - 1][mid + s - 1] +
              A[i - 1][mid - 1];

            if (l >= k * s * s) {
              high = mid - 1;
              p = mid;
              flag = 1;
            } else {
              low = mid + 1;
            }
          }
          if (flag == 1) {
            ans += (m - s - p + 2);
          }
        }
      }

      System.out.println(ans);
    }
  }
}
