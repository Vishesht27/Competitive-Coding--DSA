import java.util.*;
class BitStrings{
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int mod = (int)Math.pow(10,9)+7;
		int n = sc.nextInt();
		int p = 1;
		while(n-->0){
			p=(p*2)%mod;
		}
		System.out.println(p);
    }
}
