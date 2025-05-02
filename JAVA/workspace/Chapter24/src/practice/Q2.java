package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. year.txt 파일에 1900년부터 2025년까지의 윤년을 출력해보자
		try (Writer out = new FileWriter("year.txt")) {
			for (int i = 1900; i <= 2025; i++) {
				if (i % 4 == 0) {
					out.write(i+"년도는 윤년입니다.");
					out.write(13);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}