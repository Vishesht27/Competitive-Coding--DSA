import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer>myMap=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            myMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.get(s)==null)
            System.out.println("Not found");
            else{
                System.out.println(s+"="+myMap.get(s));
            }
        }
        in.close();
    }
}
