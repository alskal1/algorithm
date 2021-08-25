package com.algo.boj;

import java.util.Scanner;

/**
 * 
 * BOJ_2810 컵홀더
 *
 */
public class Main_2810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char seat[] = new char[N];
		String s = sc.next();
		for (int i = 0; i < N; i++) {
			seat[i] = s.charAt(i);
		}
		int cnt = 1;
		for(int i =0; i<N; i++) {
			if(seat[i]=='S') cnt++;
			else if(seat[i]=='L') {
				i++;
				cnt++;
			}
		}
		if(cnt<N) System.out.println(cnt);
		else {
			System.out.println(N);
		}
	}

}
