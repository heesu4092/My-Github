package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		가위바위보 게임 만들기
		Scanner sc = new Scanner(System.in);
		try {
			int win = 0;
			int lose = 0;
			int tie = 0;
			while(win<5) {
				System.out.println("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
				int player = sc.nextInt();
				if(1>player && player>3) {
					System.out.println("1~3사이의 숫자를 입력해주세요.");
					continue;
				}
				int computer = (int)(Math.random()*3)+1;
				int result = player - computer;
				
				String resultStr = "";
				if(result == 0) {
					resultStr = "비김";
					tie++;
				}else if(result == -2 || result == 1) {
					resultStr = "승리";
					win++;
				}else if(result == -1 || result == 2) {
					resultStr = "패배";
					lose++;
				}
				System.out.println("플레이어:"+checkNum(player)+"vs"+checkNum(computer)+":컴퓨터 "+resultStr);
				System.out.println("승리:"+win+"/5 , 패배:"+lose+" , 비김:"+tie);
			}
			System.out.println("가위바위보가 종료되었습니다.");
		} catch (InputMismatchException e) {
			System.out.println("1~3사이의 숫자를 입력해주세요.");}
		}
			public static String checkNum(int num) {
			String result = "";
			if(num==1) {
				result = "가위";
			}else if(num == 2) {
				result = "바위";
			}else if(num == 3){
				result = "보";
			}else {System.out.println("0~2사이의 숫자를 입력해주세요.");}
			return result;
	}

}
