package section03;
/*
 * 연산자 (Operator)
 * 	프로그램에서 데이터를 처리하여 산출하는 것을 연산 (operation)
 * 	연산에 사용되는 표시나 기호를 연산자 (operator)라고 한다.
 * 
 * 	1. 산술연산자
 * 	 +, -, *, /, %
 * 
 */
public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 두수의 합을 구해 sum이라는 int형 변수에 대입
		// 두수의 합 = 숫자 + 숫자
		int sum = num1 + num2;
		System.out.println("sum: " + sum); //문자열 + 숫자 -> 값이 연결된 문자열
		
		// 숫자 + 문자열은 문자열이다.
		// 문자열 + 연결연산자이다.
		String result = num1 + "+" + num2 + "=" + sum;
		System.out.println(result);
		
		// 두수의 곱을 구해서 multiply라는 변수에 대입
		int multiply = num1 * num2;
		System.out.println("multiply : " + multiply);
		
		// 나누기
		int divide = 10/3;
		System.out.println("10/3 : " + divide);
		
		int divide2 = num1 / num2;
		System.out.println("num1 / num2 : " +divide2);
		
		// 나머지 값
		int resultNum = 9 % 5;
		System.out.println("9 % 5 : " + resultNum);
		
		
		
	}
}
