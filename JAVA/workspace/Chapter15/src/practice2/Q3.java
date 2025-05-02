package practice2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음 그림과 같이 위쪽과 왼쪽 숫자를 곱한 곱셈표를 출력하는 프로그램을 작성하시오
//		   | 1  2  3  4  5  6  7  8  9
//		---+------------------------
//		 1 | 1  2  3  4  5  6  7  8  9
//		 2 | 2  4  6  8 10 12 14 16 18
//		 3 | 3  6  9 12 15 18 21 24 27
//		             ~
//		 9 | 9 18 27 36 45 54 63 72 81

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 9개 입력>>");
		int[] intArr1 = new int[9];
	  	int[] AnwsArr = new int[9];
		for(int i=0; i<AnwsArr.length; i++) {
		  	AnwsArr[i] = sc.nextInt();
		}
		for(int j=0; j<AnwsArr.length; j++) {
			System.out.print(j+" | ");
	  	for(int i=0; i<AnwsArr.length; i++) {
	  		intArr1[i] = AnwsArr[j] * AnwsArr[i];
	  		System.out.print(intArr1[i] + " | ");
	  	}
	  	System.out.println();
		}
	  	
	  	
	}

}
