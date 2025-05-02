package practice;

class DeskTop{
	@Override
	public String toString() {
		return "데스크탑을 실행합니다.";
	}
}
class NoteBook{
	@Override
	public String toString() {
		return "노트북을 실행합니다.";
	}
}
class Phone{
	@Override
	public String toString() {
		return "폰을 실행합니다.";
	}
}
class Tablet{
	@Override
	public String toString() {
		return "테블릿을 실행합니다.";
	}
}
class Computer<T> {
	private T unit;
	public void set(T unit) {
		this.unit = unit;
	}
	public T get() {
		return unit;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭을 사용하여 위에 작성한 클래스를 작성해보자
		Computer<DeskTop> desktop = new Computer<>();
		Computer<NoteBook> notebook = new Computer<>();
		Computer<Phone> phone = new Computer<>();
		Computer<Tablet> tablet = new Computer<>();
		
		desktop.set(new DeskTop());
		notebook.set(new NoteBook());
		phone.set(new Phone());
		tablet.set(new Tablet());
		
		System.out.println(desktop.get());
		System.out.println(notebook.get());
		System.out.println(phone.get());
		System.out.println(tablet.get());
		
	}

}
