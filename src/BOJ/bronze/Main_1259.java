import java.io.*;

public class Main_1259 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) break;
			else {
				StringBuilder sb = new StringBuilder(num);
				String tmp = sb.reverse().toString();
				String ans = num.equals(tmp) ? "yes" : "no";
				System.out.println(ans);
			}
		}

	}

}
