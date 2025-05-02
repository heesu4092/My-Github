package practice2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 5. 크기가 10인 배열을 작성하고 Math.random()함수를 사용하여 1~100사이의 숫자를 랜덤하게 생성하
//		 고 생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라. (단 배열의 각 요소는 서로 
//		 다른 값만 저장되도록 한다.) 
		
		System.out.println("랜덤된 숫자가 생성됩니다.");
		int[] intArr = new int[10];
		for(int i=0; i<intArr.length; i++) {
			int a = (int)(Math.random()*100+1);
			if(a%3==0) {
//				중복값을 확인하는 boolean 변수
				boolean flag = false;
				for(int j=0; j<i; j++) {
					if(a == intArr[j]) {
						flag = true;
					}
				}
//				중복이 없는 경우 a를 저장
				if(!flag) {
				intArr[i]=a;
				}else {
					i--;
				}
				System.out.println(a);
			}else {
				i--;
			}
		}
	}

}
