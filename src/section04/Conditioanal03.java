package section04;

public class Conditioanal03 {
	public static void main(String[] args) {
		char key = 'w' ;
		switch(key) {
		case 'w' :
			System.err.println("앞으로 이동");
			break;
		case 'a' :
			System.err.println("좌측으로 이동");
			break;
		case 's' :
			System.err.println("뒤로 이동");
			break;
		case 'd' :
			System.err.println("우측으로 이동");
			break;
		default :
			System.err.println("Hold!");
			break;
		}
	}
}
