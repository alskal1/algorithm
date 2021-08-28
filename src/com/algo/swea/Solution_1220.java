package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_1220 Magnetic
 * 
 *
 */
public class Solution_1220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j =0; j<n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int cnt = 0;
			for(int i =0; i<n; i++) {
				int check = 0;
				for(int j=0; j<n; j++) {
					if(arr[j][i] == 1) {
						check=1;
					}
					else if(arr[j][i] == 2 && check == 1) {
						cnt++;
						check = 0;
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}

	}

}
