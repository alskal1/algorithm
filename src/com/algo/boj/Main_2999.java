package com.algo.boj;

import java.util.Scanner;

/**
 * 
 * BOJ_2999 비밀 이메일
 *
 * 정인이가 보내는 메시지는 총 N글자 
 * R<=C R*C=N 
 * R이 큰 값 
 * R이 행 C는 열
 * 
 */
public class Main_2999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans[][];
		String message = sc.next();
		int R = 0;
		int C = 0;
		int index = 0;
		for (int i = 1; i <= message.length(); i++) {
			if (message.length() % i == 0 && i * (message.length() / i) == message.length()
					&& i <= message.length() / i) {
				R = Math.max(R, i);
				C = message.length() / i;
			}
		}
		ans = new char[R][C];
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				ans[j][i] = message.charAt(index);
				index++;
			}
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(ans[i][j]);
			}
		}

	}

}
