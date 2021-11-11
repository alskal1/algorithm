package BOJ.recur;

import java.util.Scanner;

/**
 * 
 * BOJ_11729 하노이 탑 이동 순서
 * 
 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
 * 각 원판은 반경이 큰 순서대로 쌓여있다.
 * 첫 번째 장대에서 세 번째 장대로 옮기기
 * - 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 * - 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 * - 이동 횟수는 최소가 되어야 한다.
 */
public class Main_11729 {

	static int cnt = 0;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		int N = sc.nextInt();
		recur(N,1,2,3);
		System.out.println(cnt);
		System.out.println(sb.toString());

	}

	private static void recur(int n, int start, int middle, int end) {
		if( n == 0) {
			return ;
		}
		
		recur(n-1, start, end, middle);
		cnt++;
		sb.append(start + " " + end + "\n");
		recur(n-1, middle, start, end);
		
	}

}
