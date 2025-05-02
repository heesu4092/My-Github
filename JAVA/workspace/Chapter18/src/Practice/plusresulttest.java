package Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class plusresulttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("2 + 5 + 6 + 10과 같은 방식으로 + 연결된 덧셈식을 입력하세요");
		String player = sc.nextLine();
		StringTokenizer st1 = new StringTokenizer(player, "+");
		
		int sum=0;
		while(st1.hasMoreTokens()) {
			String st1num = st1.nextToken().trim();
			sum+=Integer.parseInt(st1num);
		}
		System.out.println("합은 : " + sum);
	}
}
