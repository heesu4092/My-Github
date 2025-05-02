// 패키지 : 클래스 파일의 위치를 나타내는 코드(파일 생성시 자동으로 설정)
package chapter1;
 
// 퍼블릭 클래스 파일이름 : 파일이름을 틀리면 에러가 발생
// 클래스 이름은 파스칼 표기법으로 설정 : 단어의 첫글자를 대문자로
public class Hello {
	// 자바 코드가 실행되는 시작부분을 의미
	public static void main(String[] args) {
		// 콘솔창에 괄호안의 내용을 출력하는 메서드(기능)
		// 자바스크립트의 console.log()와 같은 기능
		// 문자열은 ""(큰쌍따음표만 가능)
		System.out.println("Hello world!");
		// syso를 입력 후 crtl+space 자동완성 가능
		System.out.println("println 자동완성 기능");
	}
}
