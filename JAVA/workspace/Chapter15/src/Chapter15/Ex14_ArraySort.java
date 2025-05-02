package Chapter15;

import java.util.Arrays;

public class Ex14_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,2,4};
		double[] arr2 = {4.4, 3.3, 2.2, 1.1};
		String[] arr3 = {"홍길동", "전우치", "손오공", "멀린"};
		
//		int배열의 경우 오름차순밖에 실행할 수 없음 (변수 자료형)
//		Integer배열의 경우 오름차순, 내림차순 둘다 사용 가능 (클래스 자료형)
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
//		double은 내림차순 불가, Double은 내림차순 가능
		for(int n : arr1) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for(double d : arr2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		for(String s : arr3) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}

}
