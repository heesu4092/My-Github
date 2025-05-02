package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라. 
//		[목적-배열과 for 반복문 연습] [난이도 중] 
//		정수 10개 입력>>17 3 9 -6 77 234 5 23 -3 1 
//		-6 -3 1 3 5 9 17 23 77
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[10];
		System.out.print("정수 10개 입력>>");
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr.length-1; j++) {
				if(intArr[j]>intArr[j+1]) {
					int num = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1]=num;
				}
			}
		}
		System.out.println(Arrays.toString(intArr));
		int[] intArr1 = new int[10];
		int count = 0;
		while(count<10) {
			int randomValue = (int)(Math.random()*100+1);
			if(randomValue%3 != 0) {
				continue;
			}
			boolean flag = false;
			for(int i=0; i<intArr1.length; i++) {
				if(randomValue == intArr1[i]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				intArr1[count] = randomValue;
				count++;
			}
		}
	}

}
