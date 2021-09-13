package BOJ.etc;

import java.util.Scanner;

/**
 * 
 * BOJ_8958 OX퀴즈
 * 
 */
public class Main_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++) {
			String str = sc.next();
			int sum = 0;
			int cnt = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == 'O') {
					cnt++;
					sum += cnt;
				}
				else if(str.charAt(i) == 'X') {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
