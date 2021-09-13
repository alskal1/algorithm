package SWEA.etc;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * SWEA_1974 스도쿠 검증
 *
 */
public class Solution_1974 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sudoku[][] = new int[9][9];
		for (int t = 1; t <= T; t++) {
			int ans = 1;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 9; i++) {
				set.clear();
				for (int j = 0; j < 9; j++) {
					set.add(sudoku[i][j]);
				}
				if (set.size() != 9) {
					ans = 0;
					break;
				}
			}
			for (int i = 0; i < 9; i++) {
				set.clear();
				for (int j = 0; j < 9; j++) {
					set.add(sudoku[j][i]);
				}
				if (set.size() != 9) {
					ans = 0;
					break;
				}
			}
			for (int i = 0; i <= 6; i += 3) {
				for (int j = 0; j <= 6; j += 3) {
					set.clear();
					for (int r = i; r < i + 3; r++) {
						for (int c = j; c < j + 3; c++) {
							set.add(sudoku[r][c]);
						}
					}
					if (set.size() != 9) {
						ans = 0;
						break;
					}
				}
			}
			System.out.println("#" + t + " " + ans);
		}
	}
}
