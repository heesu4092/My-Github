package ifpractice1;

import java.util.Scanner;

public class q11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중에 입력해주세요>>");
		String player = sc.next();
//		0~2 사이의 랜덤 숫자를 저장
		int computer = (int)(Math.random()*3);
		String computerStr = "";
		if(computer == 0) {
			computerStr = "가위";
		}else if(computer == 1) {
			computerStr = "바위";
		}else {	computerStr = "보"; }
		
		if(player.equals("가위")) {
			if(computerStr.equals("보")) {
				System.out.println("당신이 이겼습니다.");
				} else if(computerStr.equals("바위")) {
					System.out.println("졌습니다.");
					} else if(computerStr.equals("가위")) {
						System.out.println("비겼습니다.");
					}
			}
		if(player.equals("보")) {
			if(computerStr.equals("바위")) {
				System.out.println("당신이 이겼습니다.");
				} else if(computerStr.equals("가위")) {
					System.out.println("졌습니다.");
					} else if(computerStr.equals("보")) {
						System.out.println("비겼습니다.");
					}
			}
		if(player.equals("바위")) {
			if(computerStr.equals("가위")) {
				System.out.println("당신이 이겼습니다.");
			} else if(computerStr.equals("보")) {
				System.out.println("졌습니다.");
				} else if(computerStr.equals("바위")) {
					System.out.println("비겼습니다.");
				 	}
				} 
		}
	}
