package com.algo.boj;

import java.util.Scanner;

/**
 * 
 * BOJ_14696 딱지놀이
 * 
 * 별 : 4 동그라미 : 3 네모 : 2 세모 : 1
 * 
 *
 */
public class Main_14696 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			int aArr[] = new int[4];
			int bArr[] = new int[4];
			for (int c = 0; c < 2; c++) {
				if (c % 2 == 0) {
					int a = sc.nextInt();
					for (int i = 0; i < a; i++) {
						int num = sc.nextInt();
						if (num == 4) {
							aArr[0]++;
						} else if (num == 3) {
							aArr[1]++;
						} else if (num == 2) {
							aArr[2]++;
						} else if (num == 1) {
							aArr[3]++;
						}
					}
				} else {
					int b = sc.nextInt();
					for (int i = 0; i < b; i++) {
						int num = sc.nextInt();
						if (num == 4) {
							bArr[0]++;
						} else if (num == 3) {
							bArr[1]++;
						} else if (num == 2) {
							bArr[2]++;
						} else if (num == 1) {
							bArr[3]++;
						}
					}
				}
			}

			int cnt = 0;
			for (int j = 0; j < 4; j++) {
				if (aArr[j] > bArr[j]) {
					System.out.println("A");
					break;
				} else if (aArr[j] < bArr[j]) {
					System.out.println("B");
					break;
				} else {
					if (aArr[j] > bArr[j]) {
						System.out.println("A");
						break;
					} else if (aArr[j] < bArr[j]) {
						System.out.println("B");
						break;
					}else if(cnt == 3) {
						System.out.println("D");
					}
					else {
						++cnt;
					}
				}
			}

		}

	}

}
