package Chapter12_5;

interface Cry {
	void cry();
}

class Cat implements Cry {
	public void cry() {
		System.out.println("야옹~");
	}
	public void walk() {
		System.out.println("조용히 걷습니다.");
	}
}

class Dog implements Cry {
	public void cry() {
		System.out.println("멍멍!");
	}
	public void run() {
		System.out.println("달립니다.");
	}
}

class Bird implements Cry {
	public void cry() {
		System.out.println("삐약삐약!");
	}
	public void fly() {
		System.out.println("날아갑니다.");
	}
}

public class Ex03_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cry test1 = new Cat();
//		test1.instance가 Cat클래스로 작성되어있는지 확인하고 맞으면 true, 틀리면 false
		if (test1 instanceof Cat) {
			test1.cry();
			Cat cat = (Cat)test1;
			cat.walk();
		}else if (test1 instanceof Dog) {
			test1.cry();
			Dog dog = (Dog)test1;
			dog.run();
		}else if (test1 instanceof Bird) {
			test1.cry();
			}else {System.out.println("고양이가 아닙니다.");}
	}

}
