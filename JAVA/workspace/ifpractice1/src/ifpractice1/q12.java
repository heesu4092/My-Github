package ifpractice1;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i%2==0) {
					continue;
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i<=j) {
					break;
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j<i-j; j--) {
				System.out.print("*");
			} System.out.println();
		}

		for(int i=0; i<8; i=i+2) {
			for(int j=6; j>i; j=j-2) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			}
	
		for(int i=0; i<10; i=i+2) {
			for(int j=1; j<i; j=j+2) {
				System.out.print(" ");
			}
			for(int k=8; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<6; i=i+2) {
			for(int j=6; j>i; j=j-2) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=0; i<7; i=i+2) {
			for(int j=1; j<i; j=j+2) {
				System.out.print(" ");
			}
			for(int k=7; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		int v=0;
		int p=0;
		while(v<5) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중에 선택해주세요 >>");
		String player = sc.next();
		int computer = (int)(Math.random()*3)+1;
		String computerStr = checkNum(computer);
		
		
		if(player.equals("가위")) {
			if(computerStr.equals("보")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 승리");
				v++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if (computerStr.equals("바위")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 패배");
				p++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if(computerStr.equals("가위")) {
				System.out.println("비겼습니다.");
				}
		}
		
		if(player.equals("바위")) {
			if(computerStr.equals("가위")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 승리");
				v++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if (computerStr.equals("보")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 패배");
				p++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if(computerStr.equals("바위")) {
				System.out.println("비겼습니다.");
				}
		}
		
		if(player.equals("보")) {
			if(computerStr.equals("바위")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 승리");
				v++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if (computerStr.equals("가위")) {
				System.out.println("플레이어 " + player + "vs" + computerStr + " 컴퓨터 : 패배");
				p++;
				System.out.println("승리 : " + v + "/5 , 패배 : " + p);
			}else if(computerStr.equals("보")) {
				System.out.println("비겼습니다.");
				}
		}
		}
	}
	public static String checkNum(int num) {
		String result = "";
		if(num == 1) {
			result = "가위";
		}else if(num == 2) {
			result = "바위";
		}else {	result = "보"; 
		}
		return result;
	} 
}
	

		
		


