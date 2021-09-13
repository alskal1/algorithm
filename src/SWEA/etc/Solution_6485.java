package SWEA.etc;

import java.util.Scanner;

/**
 * 
 * SWEA_6485 삼성시의 버스 노선
 *
 */
public class Solution_6485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int a[] = new int[N + 1];
			int b[] = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			int cnt;
			int P = sc.nextInt();
			System.out.print("#" + t + " ");
			for (int p = 1; p <= P; p++) {
				int c = sc.nextInt();
				cnt = 0;
				for (int i = 1; i <= N; i++) {
					if (a[i] <= c && c <= b[i]) {
						cnt++;
					}
				}
				System.out.print(cnt + " ");
			}
			System.out.println();
		}

	}

}
