package com.algo.swea;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * SWEA_1984 중간 평균값 구하기
 * 
 *
 */
public class Solution_1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int sum = 0;
			for (int i = 1; i < 9; i++) {
				sum += arr[i];
			}
			System.out.println("#" + t + " " + Math.round(sum / 8.0));
		}
	}

}
