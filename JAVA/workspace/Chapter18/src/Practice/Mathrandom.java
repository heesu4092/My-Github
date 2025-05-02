package Practice;

import java.util.Random;
import java.util.Scanner;

public class Mathrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)>>");
				int player = sc.nextInt();
				if(player == 4) {
					System.out.println("게임을 종료합니다... ");
					break;
				}else if(player > 4) {
					System.out.println("1~4까지의 수만 입력해주세요.");
					continue;
				}
				int computer = (int)(Math.random()*3+1);
	//			Random r = new Random();
	//			computer = r.nextInt(3)+1;
				int result = player - computer;
				if(result == 0) {
					System.out.println("비겼습니다.");
				}else if(result == -2 || result == 1) {
					System.out.println("사용자가 이겼습니다.");
				}else {
					System.out.println("사용자가 졌습니다.");
				}
			}
			}catch(Exception e) {
				System.out.println("1~4까지의 수만 입력해주세요.");
		}
	}

}
