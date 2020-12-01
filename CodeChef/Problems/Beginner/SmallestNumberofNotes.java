import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int count=0;
            while(n>0){
                if(n>99){
                    n=n-100;
                    count++;
                }else if(n>49 && n<100){
                    n=n-50;
                    count++;

                }else if(n>9 && n<50){
                    n=n-10;
                    count++;
                }else if(n>4 && n<10){
                    n=n-5;
                    count++;
                }else if(n>1 && n<5){
                    n=n-2;
                    count++;}
                else if(n>0 && n<2)
                {n=n-1;
                count++;
                }
            }
            System.out.println(count);
		}
	}
}
