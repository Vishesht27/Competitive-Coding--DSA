import java.util.*;
class codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
char ch = sc.next().charAt(0);
			if (ch == 'b' || ch == 'B') {
				System.out.println("BattleShip");
			}
			else if (ch == 'c' || ch == 'C') {
				System.out.println("Cruiser");
			}
			else if (ch == 'd' || ch == 'D') {
				System.out.println("Destroyer");
			}
			else if (ch == 'f' || ch == 'F') {
				System.out.println("Frigate");
			}
}
}
}
