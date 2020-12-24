import java.util.*;

class Maxatt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int T=sc.nextInt();
        for(int i=1;i<=T;i++) {

            int m=0;

            int N = sc.nextInt();
            String B=sc.next();

            for(int j=1;j<=N;j++){

                if(B.charAt(j-1)=='1'){
                    m++;
                }
            }

            if((double)(((120-N+m)/120.0)*100)>=75){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

		}
  }
