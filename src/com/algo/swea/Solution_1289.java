package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_1289 원재의 메모리 복구하기
 * 
 */
public class Solution_1289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String memory = sc.next();
			int cnt = 0;
			for (int i = 0; i < memory.length(); i++) {
				if (i == 0) {
					if (memory.charAt(i) == '1')
						cnt++;
				} else {
					if (memory.charAt(i) != memory.charAt(i - 1))
						cnt++;
				}
			}
			System.out.println("#" + t + " " + cnt);
		}

	}

}
