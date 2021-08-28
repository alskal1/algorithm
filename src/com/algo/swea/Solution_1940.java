package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_1940 가랏! RC카!
 *
 */
public class Solution_1940{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int ms = 0;
			int distance = 0;
			for(int n=0; n<N; n++) {
				int command = sc.nextInt();
				if(command == 0) {
					
				}
				else if(command == 1) {
					ms += sc.nextInt();
				}
				else if(command == 2) {
					ms -= sc.nextInt();
					if(ms<0) {
						ms = 0;
					}
				}
				distance += ms;
			}
			System.out.println("#"+t+" "+distance);
		}
	}

}
