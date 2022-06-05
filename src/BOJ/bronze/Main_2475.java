import java.util.Scanner;

public class Main_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			sum += Math.pow(n, 2);
		}
		System.out.println(sum%10);
	}
}
