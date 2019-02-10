package com.cg.library.daoservices;

import com.cg.library.beans.Book;
import com.cg.library.beans.Member;
import com.cg.library.util.LibraryDBUtil;

public class BookDAOServicesImpl implements BookDAOServices{

	@Override
	public String updateBookStatus(int bookId, String bookName,String bookStatus) {
	Book book=new Book(bookId, bookName);
	book.setBookStatus(bookStatus);
		return "Status Updated to"+book.getBookStatus();
	}

	@Override
	public Book getBookDetails(int bookId) {
		return LibraryDBUtil.books.get(bookId);
	}

	@Override
	public Book addBook(String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo) {
		Book book=new Book(bookname, bookAuthor, bookStatus, numberOfBooks, bookrackNo);
		book.setBookId(LibraryDBUtil.getBOOK_ID_COUNTER());
		return book ;
		
	}

}
