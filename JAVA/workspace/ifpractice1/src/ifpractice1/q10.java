package ifpractice1;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요>>");
		int year = sc.nextInt();
		if(year%400 == 0) {
			System.out.println("윤년입니다.");
		} else if(year%100 == 0) {
			System.out.println("윤년이 아닙니다.");
		} else if(year%4 == 0) {
			System.out.println("윤년입니다.");
		} else {System.out.println("윤년이 아닙니다.");}
		
			
	}
}
