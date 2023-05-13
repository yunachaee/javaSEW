package section05;
/* 
 * 2. do ~ while 문
 *  while문과 비슷하지만, 최소 한번은 실행된다.
 *  
 *  do {
 *  	반복 수행할 코드
 *  } while(조건문);
 *  
 */

public class Loop02 {
	public static void main(String[] args) {
		int count = 0;
		do { 	//	조건이 맞지 않아도 최초 한번은 실행된다.
			System.out.println(count);
			count++;
		} while(count < 100); // 100이 되면 만족 못하므로 99에서 멈춤
		
	}
}
