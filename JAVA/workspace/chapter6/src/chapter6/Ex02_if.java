package chapter6;

public class Ex02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 89;
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		int a = 11;
		if(a%2==0) {
			System.out.println("짝수입니다.");
		}else {System.out.println("홀수입니다.");}
		
		int b = 220;
		b = b + 20;
		if(b > 255) {
			System.out.println("255");
		}else if(b < 0) {
			System.out.println("0");
		}else {System.out.println(b);}
	}

}
