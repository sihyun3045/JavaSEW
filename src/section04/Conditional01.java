package section04;
/*
 * 1. if문 
 * 	if(조건식) {
 * 		조건식이 true일 때 실행 명령문
 * }
 * 	if(조건식)
 * 		조건식이 true 일 때 실행 명령문(명령문이 한줄(;) 일때 중괄호 생략 가능
 * 
 *  if(조건식1) {
 *  	조건식이 true일 때 실행 명령문
 *  } else if(조건식2) {
 *  	조건식2 true일 때 실행 명령문
 * } else{
 * 	조건식이 false일 때 실행 명령문
 * }
 * 
 */
public class Conditional01 {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0)
			System.out.println("num은 짝수 입니다.");
		if(num %2 !=0)
			System.out.println("num은 홀수 입니다.");
		
		if(num % 2 ==0)
			System.out.println("num은 짝수 입니다.");
		else
			System.out.println("num은 홀수 입니다.");
		
		double num2 =13;
		if(num2 % 3 ==0) {
			System.out.println("num2는 나머지가 0입니다");
		} else if(num2 % 3 ==1) {
			System.out.println("num2는 나머지가 1입니다.");
		} else {
			System.out.println("정수가 아닙니다");
		}
	}

}
