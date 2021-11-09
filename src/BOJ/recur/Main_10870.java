package BOJ.recur;

import java.util.Scanner;

/**
 * 
 * BOJ_10870 피보나치 수 5
 * 
 * 피보나치 수는 0과 1로 시작 
 * n이 주어졌을 때, n번째 피보나치 수를 구하기
 */
public class Main_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(recur(n));
	}

	private static int recur(int i) {
		if (i <= 1) {
			return i;
		} else {
			return recur(i - 1) + recur(i - 2);
		}

	}

}
