package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	String dname;
	int snum;
	double score;
	
	public Student(String name, String dname, int snum, double score) {
		this.name = name;
		this.dname = dname;
		this.snum = snum;
		this.score = score;
	}
}
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 학생정보를 나타내는 Student클래스에 이름, 학과, 학번, 학점을 저장하는 필드를 작성하라.  
//		(1) 
//		학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student>컬렉션에 저장한 후에, 
//		ArrayList<Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아 해당 학생의 학생정
//		보를 출력하는 프로그램을 작성하라. 
//		(2) ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라. 해시
//		맵의 키(key)는 학생이름으로 한다. -------------------------------------------- 
//		학생이름, 학과, 학번, 학점을 입력하세요.  
		List<Student> list = new ArrayList<>();
		String name;
		String dname;
		int snum;
		double score;
		System.out.println("학생이름, 학과, 학번, 학점을 입력하세요. ");
		while(list.size() < 5) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			name = sc.next();
			dname = sc.next();
			snum = sc.nextInt();
			score = sc.nextDouble();
			list.add(new Student(name, dname, snum, score));
		}
		System.out.println("----------------------------------------");
		for(Student str: list) {
			System.out.println("이름 : " + str.name);
			System.out.println("학과 : " + str.dname);
			System.out.println("학번 : " + str.snum);
			System.out.println("학점 : " + str.score);
			System.out.println("--------------------------");
		}
		while(true) {
			System.out.println("학생 이름 >>");
			Scanner pn = new Scanner(System.in);
			String printName = pn.next();
			for(Student str1: list) {
			if(printName.equals("그만")) {
				break;
			}else if(printName.equals(str1.name)) {
				System.out.println(str1.name + ","+str1.dname+","+str1.score+","+str1.snum);
			}
			}
		}
		
	}
}
