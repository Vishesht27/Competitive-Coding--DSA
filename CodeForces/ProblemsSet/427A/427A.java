import java.util.*;
public class PoliceRecruits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[1000000];
        int sum=0;
        int not=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
        if(arr[i]>0){
            sum+=arr[i];
        }else if(sum>0){
            sum--;
        }else{
            not++;
        }
        }
    System.out.println(not);
    }
}
