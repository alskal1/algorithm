import java.util.Scanner;

public class Main_10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int roomNum = 0;
			if(N % H == 0) {
				roomNum = (H * 100) + (N / H);
			}
			else {
				roomNum = ((N%H) * 100) + ((N / H) + 1);
			}
			System.out.println(roomNum);
		}
	}
}
