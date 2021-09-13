package BOJ.etc;

import java.util.Scanner;

/**
 * 
 * BOJ_2798 블랙잭
 * 
 *
 */
public class Main_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cardNum[] = new int[N];
		for (int i = 0; i < N; i++) {
			cardNum[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (cardNum[i] + cardNum[j] + cardNum[k] <= M) {
						max = Math.max(cardNum[i] + cardNum[j] + cardNum[k], max);
					}
				}
			}
		}
		System.out.println(max);
	}
}
