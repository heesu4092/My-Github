package practicce;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제1
//		주민등록번호의 연월일을 각각의 변수에 저장하세요.
		String str = "250418-1234567";
		String year = str.substring(0,2);
//		Integer.parseInt("문자열") : 문자열을 int자료형으로 변환
		int intYear = Integer.parseInt(year);
//		50보다 크면 19를 더하고 50보다 작으면 20을 더함
		if(intYear>50) {
			year = "19"+year;
		}else {year = "20"+year;}
		
		String month = str.substring(2,4);
		String day = str.substring(4,6);
		System.out.println(year + "년" + month + "월" + day + "일이 생일입니다.");
		
//		문제2
//		a/b/c/d를 a:b:c:d 로 바꾸어 저장하세요.
		String str2 = "a/b/c/d";
		StringTokenizer str3 = new StringTokenizer(str2, "/");
		while (str3.hasMoreTokens()) {
			System.out.print(str3.nextToken()+":");
		}		
		System.out.println();
		String[] strArr = str2.split("/");
		String str4 = "";
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i]);
			if(i<strArr.length-1) {
				str4 += ":";
			}
		}
		System.out.println(str4);
		String str5 = str2.replace("/",":");
		System.out.println(str5);
	}

}
