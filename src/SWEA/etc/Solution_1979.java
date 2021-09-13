package SWEA.etc;

import java.util.Scanner;

/**
 * 
 * SWEA_1979 어디에 단어가 들어갈 수 있을까
 * 
 *
 */
public class Solution_1979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int puzzle[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[i][j] == 1) {
						cnt++;
					} else {
						if (cnt == K) {
							ans++;
						}
						cnt = 0;
					}
				}
				if (cnt == K) {
					ans++;
				}
			}
			for (int i = 0; i < N; i++) {
				int cnt = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[j][i] == 1) {
						cnt++;
					} else {
						if (cnt == K) {
							ans++;
						}

						cnt = 0;

					}
				}
				if (cnt == K) {
					ans++;
				}
			}
			System.out.println("#" + t + " " + ans);
		}
	}

}
