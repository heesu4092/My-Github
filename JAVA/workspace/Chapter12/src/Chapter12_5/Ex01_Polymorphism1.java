package Chapter12_5;

abstract class Calc {
	int a = 5;
	int b = 6;
	
	void plus() {
		System.out.println(a + b);
	}
}

class MyCalc extends Calc {
	void plus() {System.out.println(a + b);}
	void minus() {System.out.println(a - b);}
}

class YourCalc extends Calc {
	void plus() {System.out.println(a+b + " : Yourplus의 결과입니다.");}
	void minus() {System.out.println(a-b + " : Yourminus의 결과입니다.");}
}
public class Ex01_Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc myCalc1 = new MyCalc();
//		부모클래스를 오버라이드한 내용을 실행
		myCalc1.plus();
//		자식클래스에서 추가한 메서드를 실행
		myCalc1.minus();
		
//		부모클래스의 타입에 자식클래스의 생성자를 사용하여 인스턴스생성
		Calc myCalc2 = new MyCalc();
//		부모클래스의 메서드는 실행 가능 => 실행 코드는 자식클래스의 코드가 실행됨
		myCalc2.plus();
//		부모클래스의 인스턴스를 자식클래스로 변경하는 방법
		MyCalc ChangeCalc = (MyCalc)myCalc2;
		ChangeCalc.minus();
		
		Calc yourCalc1 = new YourCalc();
		yourCalc1.a = 10;
		yourCalc1.b = 20;
		YourCalc changeCalc = (YourCalc)yourCalc1;
		yourCalc1.plus();
		changeCalc.minus();
	}

}
