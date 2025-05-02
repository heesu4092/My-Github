package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
	private String name;
	private String dname;
	private int snum;
	private double score;

	public Student(String name, String major, int num, double scoreAvg) {
		this.name = name;
		this.dname = dname;
		this.snum = snum;
		this.score = score;
	}

	@Override
	public String toString() {
		return this.name + "," + this.dname + "," + this.snum + "," + this.score;
	}

	public class Q4_2 {

		public void main(String[] args) {
			// TODO Auto-generated method stub
			HashMap<String, Student> student = new HashMap<>();
			Scanner scan = new Scanner(System.in);
			String name;
			String dname;
			int snum;
			double score;
			System.out.println("학생이름, 학과, 학번, 학점을 입력하세요. ");
			while (student.size() < 5) {
				System.out.print(">>");
				Scanner sc = new Scanner(System.in);
				name = sc.next();
				dname = sc.next();
				snum = sc.nextInt();
				score = sc.nextDouble();
				student.put(name, new Student(name, dname, snum, score));
			}
			System.out.println("----------------------------------------");
			for (String Key : student.keySet()) {
				Student s = student.get(Key);
				System.out.println("이름 : " + s.name);
				System.out.println("학과 : " + s.dname);
				System.out.println("학번 : " + s.snum);
				System.out.println("학점 : " + s.score);
				System.out.println("--------------------------");
			}
			while (true) {
				System.out.print("학생 이름 >>");
				String input = scan.next();
				if (input.equals("그만")) {
					System.out.println("End");
					break;
				}
				Student stu = student.get(input);
				System.out.println(stu);
			}
		}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																

	}
}
