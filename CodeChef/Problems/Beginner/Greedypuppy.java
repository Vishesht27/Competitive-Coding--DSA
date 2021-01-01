import java.util.*;

class greedypuppy {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      List<Long> vowels = new ArrayList<>();
      int n = sc.nextInt();
      int k = sc.nextInt();
      int max = 0;
	        for(int i=1;i<=k;i++){
	            int temp = n%i;
	            if(temp>max){
	                max=temp;
	            }
	        }
	        System.out.println(max);
    }
  }
}
