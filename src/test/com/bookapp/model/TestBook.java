package test.com.bookapp.model;

import com.bookapp.model.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book book = new Book();
book.setId(100);
book.setName("html");
book.setPrice(1000);
System.out.println(book);
	}

}
