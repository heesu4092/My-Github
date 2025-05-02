package chapter24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex11_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {
			String str;
			
			while(true) {
//				readLine() : 파일의 한줄을 읽는 메서드
				str=br.readLine();
//				null 은 글자가 없을때 출력되는 값
				if(str == null)
					break;
//				읽은 글자를 출력하는 부분
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
