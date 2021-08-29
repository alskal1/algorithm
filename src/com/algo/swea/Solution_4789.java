package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_4789 성공적인 공연 기획
 * 
 * 문자열의 첫 번째 글자는 기립 박수를 하고 있는 사람이 아무도 없을 때 기립 박수를 하는 사람의 수 
 * i번째 글자는 기립 박수를 하고 있는 사람이 i-1명 이상일 때 기립 박수를 하는 사람의 수
 * 
 */
public class Solution_4789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String str = sc.next();
			int ans = 0;
			int sum = 0;
			int arr[] = new int[str.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i) - '0';
			}

			sum = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (sum >= i) {
					sum += arr[i];
				} else {
					ans += i - sum;
					sum = i + arr[i];
				}

			}
			System.out.println("#" + t + " " + ans);
		}

	}

}
