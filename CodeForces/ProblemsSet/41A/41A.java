import java.util.Scanner;
public class Translation
{
    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);
        String a=z.next();
        String b=z.next();
        StringBuilder sb=new StringBuilder(b);
        if(a.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
