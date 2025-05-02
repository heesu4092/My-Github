package practice2;

import java.util.HashMap;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. “그만”이 입력될 때까지 나라의 이름과 수도를 입력받아 저장하고 다시 나라의 이름을 입력하면 
//		수도를 출력하는 프로그램을 작성하시오. 다음의 해시맵을 이용하라. 
//		_____________________________________________________ 
//		나라이름과 수도를 입력하세요. (예 : Korea 서울) 
//		나라 이름, 수도>> Korea 서울 
//		나라 이름, 수도>> USA 워싱턴 
//		나라 이름, 수도>> England 런던 
//		나라 이름, 수도>> France 파리 
//		나라 이름, 수도>> 그만 
//		수도 검색 >> France 
//		France의 수도는 파리 
//		수도 검색 >> 스위스 
//		스위스 나라는 없습니다. 
//		수도 검색>>그만 
//		End ------------------
		HashMap<String, String> nations = new HashMap<String, String>(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름과 수도를 입력하세요. (예 : Korea 서울)");
			System.out.println("나라 이름,수도>>");
			String n = sc.next();
			
			if(n.equals("그만")) {
				break;
			} 
			String c = sc.next();
			nations.put(n, c);
		}
		while(true) {
			System.out.println("수도 검색 >>");
			String key = sc.next();
			if(key.equals("그만")) {
				System.out.println("End");
				break;
			}else if(key.equals(nations.get(key) == null)) {
				System.out.println(key + " 나라는 없습니다.");
			}
			else {
				System.out.println(key + "의 수도는 " + nations.get(key));
			}
		}
	}

}
