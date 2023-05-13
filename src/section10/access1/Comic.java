package section10.access1;

public class Comic {
	Book book1;
	public Comic() {
		book1 = new Book("체인소맨", 5400, 192, "후지모토 타츠키");
		System.out.println("제목 : " + book1.title);
		System.out.println("가격 : " + book1.price+"원");
		System.out.println("페이지수 : " + book1.totalPage);
		System.out.println("저자 : " + book1.author);
	}

}
