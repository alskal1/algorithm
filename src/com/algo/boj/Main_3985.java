package com.algo.boj;

import java.util.Scanner;

/**
 * 
 * BOJ_3985 롤 케이크
 * 
 * 길이 L미터의 롤 케이크 방청객 N명에게 나눠주기 
 * 방청객은 P번 조각부터 k번 조각
 * 
 *
 */
public class Main_3985 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); // 롤 케이크 길이
		int N = sc.nextInt(); // 방청객 수
		int cake[] = new int[L];
		int people[] = new int[N + 1];
		int max = 0;
		int expectNum = 0; // 가장 많은 조각을 받을 것으로 기대하고 있던 방청객 번호
		int maxNum = 0; // 실제로 가장 많은 조각을 받은 방청객 번호
		for (int i = 1; i <= N; i++) {
			int P = sc.nextInt();
			int K = sc.nextInt();
			if (max < K - P) { 
				max = K - P;
				expectNum = i;
			}
			for (int j = P - 1; j < K; j++) {
				if (cake[j] == 0) {
					cake[j] = i;
					people[i]++;
				}
			}
		}
		
		max = 0;		
		for (int i = 1; i <= N; i++) {
			if (max < people[i]) {
				max = people[i];
				maxNum = i;
			}
		}
		System.out.println(expectNum);
		System.out.println(maxNum);
	}

}
