package practice;

interface AdderInterface {
	int add(int x, int y); // x와 y의 합을 리턴
	int add(int n); // 1~n까지의 정수 합을 리턴, n은 0보다 큰 수로 가정
}
class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int add(int n) {
		// TODO Auto-generated method stub
			return n*(n+1)/2;
	}
	
}

public class MyAdderUse  {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
