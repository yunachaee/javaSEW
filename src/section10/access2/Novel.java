package section10.access2;

import section10.access1.Book;

public class Novel extends Book{
	
	public Novel() {

		super.title = "연금술사";
		super.price = 10800;	// protected 상속관계 접근 가능
//		super.totalPage = 600;	// default 다른 패키지 접근 불가
//		super.author = "파울로 코엘료";		//private 다른 클래스 접근불가
		
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price+"원");
//		System.out.println("페이지수 : " + totalPage);
//		System.out.println("저자 : " + author);
	}
}
