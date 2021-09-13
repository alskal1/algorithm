package SWEA.etc;

import java.util.Scanner;
/**
 * 
 * SWEA_2005 파스칼의 삼각형
 *
 */
public class Solution_2005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j || j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
				}
			}
			System.out.println("#" + t);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 0) {
						continue;
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
