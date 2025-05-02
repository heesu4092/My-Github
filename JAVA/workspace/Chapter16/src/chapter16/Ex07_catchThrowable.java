package chapter16;

import java.util.Scanner;

public class Ex07_catchThrowable {
	
	public static void myMeThod1() {
		myMeThod2();
	}
	public static void myMeThod2() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = 10 / num1;
		System.out.println(num2);
		
	public static void myMeThod3() {
		myMeThod4();
	}
	public static void myMeThod4() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = 10 / num1;
		System.out.println(num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			myMeThod1();
//			위에서 예외가 발생하면 아래 코드는 실행되지 않음
			myMeThod3();
//		Throwable : try에서 실행한 메서드에서 예외가 발생했을때 사용하는 예외클래스
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Good Bye~~!");
	}

}

