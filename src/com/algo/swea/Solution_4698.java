package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_4698 테네스의 특별한 소수
 *
 */
public class Solution_4698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[1000001];
		for (int i = 2; i < arr.length; i++) {
			int j = 2;
			while (true) {
				if (i * j > 1000000)
					break;
				arr[i * j] = 1;
				j++;
			}
		}

		for (int t = 1; t <= T; t++) {
			int D = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int cnt = 0;
			if (A == 1) {
				A = 2;
			}
			for (int i = A; i <= B; i++) {
				if (arr[i] == 0) {
					String s = String.valueOf(i);
					for (int j = 0; j < s.length(); j++) {
						if ((s.charAt(j) - '0') == D) {
							cnt++;
							break;
						}
					}
				}
			}
			System.out.println("#" + t + " " + cnt);
		}

	}

}
