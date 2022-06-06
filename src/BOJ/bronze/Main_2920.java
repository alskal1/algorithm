import java.util.Scanner;

public class Main_2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		int startN = sc.nextInt();
		if(startN == 1) {
			int cnt = 1;
			for(int i = 2; i <= 8; i++) {
				int n = sc.nextInt();
				if(n == i) cnt++; 
			}
			ans = cnt == 8 ? "ascending" : "mixed";
		}
		else if(startN == 8) {
			int cnt = 1;
			for(int i = 7; i > 0; i--) {
				int n = sc.nextInt();
				if(n == i) cnt++; 
			}
			ans = cnt == 8 ? "descending" : "mixed";
		}
		else {
			ans = "mixed";
		}
		
		System.out.println(ans);
	}

}
