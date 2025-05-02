package chapter17;

public class Ex13_MathUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Math.sqrt : 제곱근을 구해주는 메소드
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		System.out.println("log2(8): " + baseLog(8,2));
		System.out.println("2의 3승: " + Math.pow(2,3));
		System.out.println();
		
		System.out.println("원주율: " + Math.PI);
		System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 Degree: " + Math.toDegrees(2.0 * Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);
		
		System.out.println("싸인 45: " + Math.sin(radian45));
		System.out.println("코싸인 45: " + Math.cos(radian45));
		System.out.println("탄젠트 45: " + Math.tan(radian45));
	}

	private static double baseLog(double x, double base) {
		// TODO Auto-generated method stub
		return Math.log(x) / Math.log(base);
	}

}
