package practice2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 임의의 수자를 입력하여 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는 
//		경우 ‘박수짝’을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99까지 숫자를 입력해주세요.");
//		1~99 정수
//		1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 ~ ,97,98,99
//		3 은 박수짝 6은 박수짝 9는 박수짝
//		33은 박수짝짝 36은 박수짝짝 39는 박수짝짝
//		63은 박수짝짝 이런식으로 if 문을 써서 if(result가 ==3 일때) 박수짝 if result==6일때 박수짝
//		3,6,9,13,16,19,23,26,29,33,36,39,43,46,49,53,56,59 ...
		
			String str = sc.next();
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c=='3' || c=='6' || c=='9' ) {
					if(count>0) {
						System.out.print("짝");
					}else{
						System.out.print("박수짝");
					}
				}
			}
		
		
		
//		{
//			String str = String.valueOf(result);
//			for(int i=0; i<str.length(); i++) {
//				int num = Integer.parseInt(str, i);
//				if(num%3==0) {
//					System.out.println("박수짝");
//				}else if(num%3==0 && num%6==0) {
//					System.out.println("박수짝짝");
//				}else {System.out.println("3,6,9가 아닙니다.");}
//			}
//			
		}

}
