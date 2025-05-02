import com.company.area.Circle;
// 같은 이름, 두개의 파일을 임포트 불가능 => 하나만 가능
// * : 파일 내의 모든 클래스들을 임포트 but, 메모리상으로는 좋지 않음
// import com.company.*; 

public class Ex03_CircleUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3.5);
		System.out.println("반지름 3.5의 원의 넓이 " + c1.getArea());
		
		com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
		System.out.println("반지름 3.5의 원의 둘레 " + c2.getCircumference());
	}

}