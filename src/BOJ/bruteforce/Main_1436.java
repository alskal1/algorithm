package BOJ.bruteforce;

import java.util.Scanner;

/**
 * 
 * BOJ_1436 영화감독 숌
 *
 */
public class Main_1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		while (N > 0) {
			ans++;
			if (String.valueOf(ans).contains("666")) {
				N--;
			}
		}
		System.out.println(ans);

	}

}
