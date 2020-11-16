import java.util.*;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int t = sc.nextInt();

sc.nextLine();

if(t>0){

while(t > 0){

int green = sc.nextInt();

int purple = sc.nextInt();

int n = sc.nextInt();

sc.nextLine();



int count_gp = 0;

int count_pg = 0;

for(int i=0;i<n;i++){

int a = sc.nextInt();

int b = sc.nextInt();

count_gp += a*green + b*purple;

count_pg += a*purple + b*green;

}

if(count_gp <= count_pg){

System.out.println(count_gp);

}

else{

System.out.println(count_pg);

}

t--;

}

}

else{

System.exit(0);

}

}

}
