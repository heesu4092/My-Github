package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 가위바위보 게임의 결과를 1og.txt 파일에 출력해보자
//		저장예시 : 가위 vs 바위 승리:0/5, 패배:1, 비김:0
		try (Writer out = new FileWriter("log.txt")) {
			Scanner sc = new Scanner(System.in);
			int win = 0;
			int lose = 0;
			int tie = 0;
			while (win < 5) {
				System.out.println("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
				int player = sc.nextInt();
				int computer = (int) (Math.random() * 3) + 1;
				int result = player - computer;

				String resultStr = "";
				if (result == 0) {
					resultStr = "비김";
					tie++;
				} else if (result == -2 || result == 1) {
					resultStr = "승리";
					win++;
				} else if (result == -1 || result == 2) {
					resultStr = "패배";
					lose++;
				}
				out.write("플레이어:" + checkNum(player) + "vs" + checkNum(computer) + ":컴퓨터 " + resultStr);
				out.write("승리:" + win + "/5 , 패배:" + lose + " , 비김:" + tie);
			}
			System.out.println("가위바위보가 종료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String checkNum(int num) {
		String result = "";
		if (num == 1) {
			result = "가위";
		} else if (num == 2) {
			result = "바위";
		} else {
			result = "보";
		}
		return result;
	}

}