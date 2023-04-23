package section02;

import java.math.BigDecimal; //외부 코드를 같은 패키지에 가져와 사용

/*
 * 데이터 표현방식
 * 	정수표현
 * 		컴퓨터는 2진수로 표현 (bit)
 * 		부호비트 (Most significant bit) + 수치비트
 * 		음의 값을 표현할 때 2의 보수 표현
 *
 *  실수표현
 *  	지수부(e)비트 + 가수부(m)비트
 *  실수표현 수식
 *  	±(1.m)*2^(e-127)
 *  부동소수점오차
 *  	정확한 실수표현 불가능 근사치 값으로 인해 생긴 오차
 *  
 *
 * 
 */
public class Variable05 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		double d = 0.0; //데이터 크기가 클수록 오차 줄어들음 (실수때 더블 사용)
		BigDecimal bd = new BigDecimal(0.0);
		
		
		
		// for 반복문
		for(int i = 0; i < 100; i++) { //i 초기화하고서 0부터 100보다 작을 때까지
			f += 0.1f; //0.10~100까지 더하기
			d += 0.1d;
			bd = bd.add(new BigDecimal(0.1)); //BigDecimal타입으로 0.1을 더하다
			
		}
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(bd);
		
	}
}
