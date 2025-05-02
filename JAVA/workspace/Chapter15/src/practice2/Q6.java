package practice2;

import java.util.Scanner;
import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 배열을 사용하여 다음의 숫자를 정렬하라. 정렬방법은 선택정렬, 삽입정렬, 버블정렬을 수행하라.
//		 15, 7, 2, 9, 10, 12, 17, 11, 20, 5
//		Scanner sc = new Scanner(System.in);
//		int[] intArr = new int[10];
//		System.out.print("정수 10개 입력>>");
//		for(int i=0; i<intArr.length; i++) {
//			intArr[i] = sc.nextInt();
//		}
//		for(int i=0; i<intArr.length; i++) {
//			for(int j=0; j<intArr.length-1; j++) {
//				if(intArr[j]>intArr[j+1]) {
//					int num = intArr[j];
//					intArr[j] = intArr[j+1];
//					intArr[j+1]=num;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(intArr));
		int[] a = {15, 7, 2, 9, 10, 12, 17, 11, 20, 5};
//		선택정렬
		int tempValue, tempJ = 0;
		for(int i=0; i< a.length; i++) {
//			MAX_VALUE상수 : int에 저장할 수 있는 가장 큰 값
//			임시로 가장 큰 값을 저장하고 첫번째 반복 이후에는 배열에서 가장 작은 값이 저장됨
			int min = Integer.MAX_VALUE; 
//			i~j까지 반복
			for(int j=i; j< a.length; j++) {
//				a[j]이 min에 있는 값보다 작으면
				if(a[j] < min) {
//					min에 a[j]를 저장
					min = a[j];
//					tempJ에 가장 작은값이 있는 배열의 위치값(인덱스)을 저장
					tempJ = j;
				}
			}
//			반복이 시작될때의 값을 tempValue에 저장
			tempValue = a[i];
//			반복이 시작될때의 배열에 가장 작은 값을 저장
			a[i] = a[tempJ];
//			가장 작은값이 있던 배열에 반복이 시작될때의 값을 저장
			a[tempJ] = tempValue;
		}
		System.out.println(Arrays.toString(a));
//		삽입정렬
		int[] b = {5,3,8,1,2,7};
		int target,tempValue1 = 0;
		for(int i=1; i<b.length; i++) {
			tempValue1 = b[i]; // 값 3 
			target = i-1; // 위치값 0
			while(target >= 0 && b[target] > tempValue1) {
				b[target+1] = b[target];
				target--;
			}
			b[target+1]=tempValue1;
		}
		System.out.println(Arrays.toString(b));
	}

}

