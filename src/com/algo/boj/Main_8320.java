package com.algo.boj;

import java.util.Scanner;

/**
 * 
 * BOJ_8320 직사각형을 만드는 방법
 * 
 * 변의 길이가 1인 정사각형 n개
 * 두 직사각형 A B
 * A를 이동, 회전시켜서 B를 만들 수 없으면 두 직사각형은 다르다.
 * 만들 수 있는 직사각형의 개수 
 *
 */
public class Main_8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i =1; i<=n; i++) {
			for(int j = i; i*j<=n; j++) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
