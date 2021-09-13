package BOJ.etc;

import java.util.Scanner;

/**
 * 
 * BOJ_2527 직사각형
 * 
 * 왼쪽 아래 꼭짓점 좌표 x,y 
 * 오른쪽 위 꼭짓점 좌표 p,q
 * 
 * 직사각형 : a 
 * 선분 : b 
 * 점 : c 
 * 공통부분이 없음 : d
 * 
 *
 */
public class Main_2527 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int p1 = sc.nextInt();
			int q1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int p2 = sc.nextInt();
			int q2 = sc.nextInt();
			if ((p1 == x2 && q1 == y2) || (x1 == p2 && q1 == y2) || (p1 == x2 && y1 == q2) || (x1 == p2 && y1 == q2)) { // 점
				System.out.println("c");
			} else if ((p1 == x2 && q1 != x2) || (x1 == p2 && q1 != y2) || (p1 != x2 && y1 == q2) // 선분
					|| (x1 != p2 && y1 == q2)) {
				System.out.println("b");
			} else if (p1 < x2 || p2 < x1 || q1 < y2 || q2 < y1) { // 공통부분 x
				System.out.println("d");
			} else { // 직사각형
				System.out.println("a"); 
			}
		}
	}

}
