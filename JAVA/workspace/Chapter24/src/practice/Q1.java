package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. gugudan.txt 파일에 1~9단까지의 구구단을 출력해보자
//		2. year.txt 파일에 1900년부터 2025년까지의 윤년을 출력해보자
//		
		
		try(Writer out = new FileWriter("gugudan.txt")) {
			for(int i=2;i<=9;i++) {
//				
				for(int j=1;j<=9;j++) {
					out.write(i+"*"+j+"="+(i*j));
					out.write(10);
		}
		
	}

	}catch(IOException e) {
		e.printStackTrace();
}
		
	}
}
