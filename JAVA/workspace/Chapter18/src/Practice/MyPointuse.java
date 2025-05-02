package Practice;

class MyPoint {
	int MypointNum1;
	int MypointNum2;
	
	MyPoint (int MypointNum1, int MypointNum2) {
		this.MypointNum1 = MypointNum1;
		this.MypointNum2 = MypointNum2;
	}
	
	@Override
	public String toString() {
		return "MyPoint("+MypointNum1+","+MypointNum2+")";
	}
}

public class MyPointuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
	}

}
