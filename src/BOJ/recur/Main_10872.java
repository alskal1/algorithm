package BOJ.recur;

import java.util.Scanner;

/**
 * 
 * BOJ_10872 팩토리얼
 * 
 * 0보다 크거나 같은 정수 N이 주어짐 
 * N! 출력
 */
public class Main_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N == 0) {
			System.out.println(1);
		} else {
			System.out.println(recur(N));
		}
	}

	private static int recur(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n * recur(n - 1);
		}
	}

}
