package Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("어절의 개수를 파악하는 프로그램입니다. 종료하고 싶으면 exit를 입력해주세요.");
		while(true) {
			String str = sc.nextLine();
        if(str.equals("exit")) {
			System.out.println("종료합니다...");
			break;
		} else {
			StringTokenizer st1 = new StringTokenizer(str);
			int wordCount = st1.countTokens();
			System.out.println("어절 개수는 " + wordCount);
			}
	}
}
}

