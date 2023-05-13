package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명ㄹ여어
 * 
 * 1. while 문
 *  while(조건문) {
 *  	반복 수행할 코드
 *  }
 *  
 *  break 문
 *  	반복문에서 break문은 반복문을 즉시 종료하는 명령어!
 *  
 *  continue 문
 *  	반복문에서 해당 반복을 건너뒤고 다음 반복을 실행하도록 강제하는 명령어!
 *  
 */
public class Loop01 {
	public static void main(String[] args) {
		// while문을 이용해 0 ~ 99 까지 출력하기
		/*
		int count = 0;
		while(true) {
			System.out.println(count);
			++count;
			if (count == 100)
				break; // 반복문 즉시 종료
		}
		*/
		/*
		int count = 0;
		while (count <100) {
			System.out.println(count);
			++count;
		}
		*/
		
		/*
		int count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			++count;
			if (count == 100)
				isRun = false;
		}
		*/
		
		int i = 0;
		System.err.println(i); //한번 더 0 출력하고 싶으면
		while(i < 7) {
			i++;
			if (i==3) {
				continue;
			}
			System.out.println(i);	
		}
	}

}

