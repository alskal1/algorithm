package BOJ.bruteforce;

import java.util.Scanner;

/**
 * 
 * BOJ_7568 덩치
 *
 */
public class Main_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int body[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			body[i][0] = sc.nextInt();
			body[i][1] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int rank = 0;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				if (body[i][0] < body[j][0] && body[i][1] < body[j][1])
					rank++;
			}
			System.out.print(rank + 1 + " ");
		}

	}

}
