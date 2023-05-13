package section05;
/*
 * 중첩 for문
 * 	for문 안에 for문 (반복문 안에 반복문)
 */
public class Loop05 {
	public static void main(String[] args) {
		/*
		  i : 0 ~ 7
		  i=0
		  	  j : i+1 = 1
		  	  j=0
		  	  	  *
		  i=1
		  	  j=0, 1
		  	      **
		  i=2
		      j=0, 1, 2
		          ***
		
		
		*/
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			
			System.out.println();  // 개행
		}
		
	}
}
