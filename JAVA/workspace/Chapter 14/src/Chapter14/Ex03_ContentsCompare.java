package Chapter14;

public class Ex03_ContentsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("A");
		String str2 = new String("a");
		String str3 = new String("banana");
		int cmp;
		
//		equals : 객체와 객체를 비교하는 메서드 (완전히 같아야함.)
//		String의 경우 안에 저장되어있는 문자열이 같은지 확인합니다.
		if(str1.equals(str3)) {
			System.out.println("두 문자열은 같습니다.");
			}else {
			System.out.println("두 문자열은 다릅니다.");
			}
//		compareTo : 문자의 순서에 맞게 str1이 앞에 있는지 뒤에 있는지를 출력하는 메서드, 한글자씩 비교를 진행함.
//		사전의 순서는 유니코드의 문자열 순서로 설정됨.
//		compareTo의 결과 세가지
//		음수 : str1이 str2 보다 사전 순으로 앞에 있음
//		0 : str1과 str2가 같음
//		양수 : str1이 str2보다 사전순으로 뒤에 있음
		cmp = str1.compareTo(str2);
		System.out.println("compareTo의 결과 : " +cmp);
		if(cmp==0) {
			System.out.println("두 문자열은 일치합니다.");
		}else if(cmp < 0) {
			System.out.println("사전의 앞에 위치하는 문자: "+str1);
		}else {
			System.out.println("사전의 앞에 위치하는 문자: "+str2);
		}
//		compareToIgnoreCase() : 대소문자 구분을 하지 않고 비교하는 메서드
		cmp = str1.compareToIgnoreCase(str2);
		System.out.println("compareToIgnoreCase의 결과 : " +cmp);
		if(str1.compareToIgnoreCase(str3)==0) {
			System.out.println("두 문자열은 같습니다.");
			} else {System.out.println("두 문자열은 다릅니다.");}
		}
}
