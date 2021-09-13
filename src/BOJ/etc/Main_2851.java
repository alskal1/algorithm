package BOJ.etc;

import java.util.Scanner;

/**
 * 
 * BOJ_2851 슈퍼 마리오
 *
 */
public class Main_2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int ans = 0;
		int mushroom[] = new int[10];
		for (int i = 0; i < 10; i++) {
			mushroom[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			sum += mushroom[i];
			if (sum == 100) {
				ans = sum;
				break;
			} else if (sum > 100) {
				int a = Math.abs(100 - sum);
				int b = Math.abs(100 - sum + mushroom[i]);
				if (a == b) {
					ans = Math.max(sum, sum - mushroom[i]);
				} else if (a > b) {
					ans = sum - mushroom[i];
				} else {
					ans = sum;
				}
				break;
			} else {
				ans = sum;
			}
		}
		System.out.println(ans);
	}
}
