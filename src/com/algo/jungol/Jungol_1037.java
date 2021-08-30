package com.algo.jungol;

import java.util.Scanner;
/**
 * 
 * JUNGOL_1037 오류교정
 *
 */
public class Jungol_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n + 1][n + 1];
		int a[] = new int[n + 1];
		int b[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				sum += arr[i][j];
			}
			if (sum % 2 != 0) {
				a[i] = 1;
			}
		}

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				sum += arr[j][i];
			}
			if (sum % 2 != 0) {
				b[i] = 1;
			}
		}
		int aSum = 0;
		int bSum = 0;
		for (int i = 1; i <= n; i++) {
			aSum += a[i];
			bSum += b[i];
		}
		if (aSum == 1 || bSum == 1) {
			int x = 0;
			int y = 0;
			for (int i = 1; i <= n; i++) {
				if (a[i] == 1) {
					x = i;
				}
				if (b[i] == 1) {
					y = i;
				}
			}
			System.out.println("Change bit (" + x + "," + y + ")");
		} else if ((aSum == 0 && bSum != 0) || (aSum != 0 && bSum == 0)) {
			System.out.println("Corrupt");
		} else {
			System.out.println("OK");
		}
	}

}
