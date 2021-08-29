package com.algo.swea;

import java.util.Scanner;

/**
 * 
 * SWEA_2007 패턴 마디의 길이
 *
 */
public class Solution_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			for(int i=1; i<=str.length(); i++) {
				String s1 = str.substring(0, i);
				String s2 = str.substring(i, i+i);
				if(s1.equals(s2)) {
					System.out.println("#"+t+" "+s1.length());
					break;
				}
			}
			
		}

	}

}
