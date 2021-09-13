package SWEA.etc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * SWEA_5356 의석이의 세로로 말해요
 *
 */
public class Solution_5356 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			char arr[][] = new char[5][15];
			for (int i = 0; i < 5; i++) {
				String str = sc.next();
				for (int j = 0; j < str.length(); j++) {
					arr[i][j] = str.charAt(j);

				}

			}
			System.out.print("#" + t + " ");
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[j][i] != 0) {
						System.out.print(arr[j][i]);
					}
				}
			}
			System.out.println();
		}

	}

}
