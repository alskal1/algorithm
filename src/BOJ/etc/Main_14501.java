package BOJ.etc;

import java.util.Scanner;

/**
 * 
 * BOJ_14501 퇴사
 * 
 * 오늘부터 N+1일째 되는 날 퇴사를 하기 위해, 남은 N일 동안 최대한 많은 상담을 하려고 한다.
 * 
 *
 */
public class Main_14501 {

	static int N, max;
	static int t[], p[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		t = new int[N + 1];
		p = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		max = 0;
		solve(1, 0);
		System.out.println(max);

	}

	private static void solve(int i, int sum) {
		if (i >= N + 1) {
			max = Math.max(max, sum);
			return;
		}
		if (i + t[i] <= N + 1) {
			solve(i + t[i], sum + p[i]);
		} else {
			solve(i + t[i], sum);
		}
		solve(i + 1, sum);
	}
}
