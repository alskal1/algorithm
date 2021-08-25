package com.algo.boj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 백준 2309 : 일곱 난쟁이
 * 
 */
public class Main_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nine[] = new int[9];
		int sum = 0;
		boolean check = false;
		for (int i = 0; i < 9; i++) {
			nine[i] = sc.nextInt();
			sum += nine[i];
		}

		for (int i = 0; i < 8; i++) {
			if (check)
				break;
			for (int j = i + 1; j < 9; j++) {
				if (sum - nine[i] - nine[j] == 100) {
					nine[i] = 0;
					nine[j] = 0;
					check = true;
					break;
				}
			}
		}
		Arrays.sort(nine);
		for (int i = 0; i < 9; i++) {
			if (nine[i] != 0) {
				System.out.println(nine[i]);
			}
		}
	}
}