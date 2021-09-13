package BOJ.etc;

import java.util.Scanner;
/**
 * 
 * BOJ_2477 참외밭
 *
 */
public class Main_2477 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0; // 참외밭 가로세로 넓이
		int maxA = 0;
		int maxB = 0;
		int arr[] = new int[7];
		for(int i=1; i<=6; i++) {
			int dir = sc.nextInt();
			arr[i] = sc.nextInt();
			if(dir == 1 || dir == 2) { // 동쪽 서쪽
				maxA = Math.max(maxA, arr[i]);
			}
			if(dir == 3 || dir == 4) { // 남쪽 북쪽
				maxB = Math.max(maxB, arr[i]);
			}
		}
		sum = maxA * maxB;
		int space = 0; // 공간
		for(int i=1; i<=6; i++) {
			if(arr[i] == maxA || arr[i] == maxB) {
				if(i == 1 ) {
					if(arr[2] == maxA || arr[2] == maxB) space = arr[4] * arr[5];
					else space = arr[3] * arr[4];
				}
				else if(i == 2) space = arr[5] * arr[6];
				else if(i == 3) space = arr[1] * arr[6];
				else if(i == 4) space = arr[1] * arr[2];
				else space = arr[2] * arr[3];
				break;
			}
		}
		System.out.println((sum-space)*K);
	}

}
