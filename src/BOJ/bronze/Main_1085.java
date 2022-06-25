import java.util.Scanner;

public class Main_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int xLen = Math.min((w-x), x);
		int yLen = Math.min((h-y), y);
		System.out.println(Math.min(xLen, yLen));
		
	}

}
