package chapter24;

import java.io.FileReader;
import java.util.Scanner;

public class Ex14_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		scanner 장점
//		텍스트 데이터를 읽을떄 여러가지 기능을 사용할 수 있음.
//		공백, 줄단위, 숫자, 단어 단위로 읽고 싶을 때
//		파싱기능이 뛰어남
		try(Scanner sc = new Scanner(new FileReader("log.txt"))){
			while(sc.hasNext()) {
//				nextLine() : 파일의 내용을 한줄씩 읽을때
				System.out.println(sc.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
