import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			set.add(sc.next());
		}
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});
		for(String str : list) {
			System.out.println(str);
		}
	}
}
