package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_1859 백만 장자 프로젝트
 * 
 *
 */
public class Solution_1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int mArr[] = new int[N];
			int benefit = 0;
			for (int n = 0; n < N; n++) {
				mArr[n] = sc.nextInt();
			}
			int max = mArr[N - 1];
			for (int i = N - 1; i >= 0; i--) {
				if (mArr[i] < max) {
					benefit += max - mArr[i];
				} else {
					max = Math.max(max, mArr[i]);
				}
			}
			System.out.println("#" + t + " " + benefit);
		}

	}

}
