package practice2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4.  소문자 알파벳을 하나 입력받아서 다음과 같은 결과가 나타나도록 코드를 작성하시오.
//		소문자 알파벳 하나를 입력하시오>> e
//		 abcde 97 98 99 100 101
//		 abcd 97 98 99 100
//		 abc 97 98 99
//		 ab 97 98
//		 a 97
		
//		abcde 97 98 99 100 101
//		bcde 98 99 100 101
//		cde 99 100 101
//		de 100 101
//		e 101
		
		char c2 = 97; // a의 아스키코드
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳을 입력하시오>>");
		String s = sc.next();
		char c = s.charAt(0);
		for(char j=c; j>=c2; j--) { // j가 97
		for(char i='a'; i<=j; i++) {   // i는 97 98 99 100 101 e까지 
			System.out.print(i);     // j가 98일때 i는 97 98 99 100 j가 99일때 i는 97 98 99
			}System.out.println();
		}
	}
}
