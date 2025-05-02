package chapter22;

interface Unit9 {
	void move(String s);
}

interface Unit8 {
	int calc(int x, int y);
}

public class Ex08_LambdaRule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit9 unit;
		
		unit = (String s) -> {System.out.println(s);};
		unit.move("Lambda:줄임 없는 표현 : 앞 예제와 동일");
		
//		실행코드가 한줄만 있기 때문에 중괄호 생략 가능
		unit = (String s) -> System.out.println(s);
		unit.move("Lambda: 중괄호 생략");
//		매개변수가 하나이기 때문에 자료형 생략 가능
		unit = (s) -> System.out.println(s);
		unit.move("Lambda: 매개변수 형 생략");
//		매개변수가 하나이기 때문에 소괄호 생략 가능
		unit = s -> System.out.println(s);
		unit.move("Lambda: 매개변수 소괄호 생략");
		
		Unit8 unit2 = (a,b) -> {return a+b;};
//		매개변수가 두개 이상이면 소괄호를 생략할 수 없음
//		unit2 = a,b -> {return a+b};
//		실행 코드가 한줄이고 return값을 설정하면 중괄호와 return을 생략할 수 있음.
		unit2 = (a,b) -> a+b;
	}
}