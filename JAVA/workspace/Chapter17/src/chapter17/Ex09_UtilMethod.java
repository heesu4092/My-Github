package chapter17;

public class Ex09_UtilMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		기초자료형 int를 Integer 래퍼클래스로 변환
		Integer n1 = Integer.valueOf(5);
//		String을 Integer로 변환
		Integer n2 = Integer.valueOf("1024");
		
		System.out.println("큰 수:" + Integer.max(n1, n2));
		System.out.println("작은 수:" + Integer.min(n1, n2));
		System.out.println("합:" + Integer.sum(n1, n2));
		System.out.println();
		
		System.out.println("12의 2진 포현: OB" + Integer.toBinaryString(12));
		System.out.println("12의 8진 포현: O" + Integer.toOctalString(12));
		System.out.println("12의 16진 포현: Ox" + Integer.toHexString(12));
	}

}
