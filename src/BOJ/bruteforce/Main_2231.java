package BOJ.bruteforce;

import java.util.Scanner;

/**
 * 
 * BOJ_2231 분해합
 *
 */
public class Main_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			int sum = 0;
			int tmp = i;
			
			while(tmp != 0) {
				sum += tmp%10;
				tmp /= 10;
			}
			if(sum+i==N) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
