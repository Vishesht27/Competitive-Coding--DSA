import java.util.*;
class chefprice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int sum1=0;
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[10000];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum = sum + arr[i];
            }
           for(int i=0;i<n;i++){
               if(arr[i]>k){
                   int c=arr[i]-k;
                   arr[i]=arr[i]-c;
               }
               sum1=sum1+arr[i];
           }
            System.out.println(sum-sum1);
        }
    }
}
