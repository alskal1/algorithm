package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_1961 숫자 배열 회전
 *
 */
public class Solution_1961 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int aArr[][] = solve(arr);
			int bArr[][] = solve(aArr);
			int cArr[][] = solve(bArr);
			System.out.println("#" + t);

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(aArr[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(bArr[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < N; j++) {
					System.out.print(cArr[i][j]);
				}
				System.out.println();
			}
		}

	}

	public static int[][] solve(int[][] arr) {
		int ans[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				ans[i][j] = arr[arr.length - j - 1][i];
			}
		}
		return ans;
	}
}