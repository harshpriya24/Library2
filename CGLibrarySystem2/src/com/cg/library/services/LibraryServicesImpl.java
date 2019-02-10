package com.cg.library.services;

import com.cg.library.beans.Book;
import com.cg.library.beans.Member;
import com.cg.library.daoservices.BookDAOServices;
import com.cg.library.daoservices.BookDAOServicesImpl;
import com.cg.library.daoservices.MemberDAOServices;
import com.cg.library.daoservices.MemberDAOServicesImpl;
import com.cg.library.util.LibraryDBUtil;

public class LibraryServicesImpl implements LibraryServices {
  
	BookDAOServices bookdao=new BookDAOServicesImpl();
	MemberDAOServices memberdao=new MemberDAOServicesImpl();
	
	public Book issueBook(int bookId,int memberId) {
	Book book=new Book(bookId);
	Member member=new Member(memberId);
	book.setBookStatus("Book Issued"+"Book Number"+book.getBookId());
    memberdao.increaseBookIssuedCount(bookId, memberId);
    bookdao.updateBookStatus(bookId,book.getBookname(), book.getBookStatus());
	return book;
		}
	public Book returnBook(int bookId,int memberId) {
		Book book=new Book(bookId);
		Member member=new Member(memberId);
		book.setBookStatus("Book Returned"+"Book Number"+book.getBookId());
	    memberdao.decreaseBookIssuedCount(bookId, memberId);
	    bookdao.updateBookStatus(bookId,book.getBookname(), book.getBookStatus());
		return book;
	}
	public  boolean verifyMember(int memberId) {
	    Member member=new Member(memberId);
	    if(LibraryDBUtil.member.containsValue(member))
		     return true;
		else
			 return false;
	}
	 public Book searchBook(int bookId,String bookName) {
		 return  bookdao.getBookDetails(bookId);
	 }
	@Override
	public Member addMember(String memberName, String memberAddress, String memberPhone) {
		return memberdao.registerNewMember(memberName, memberAddress, memberPhone);
	}
	@Override
	public Book addBook(String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo) {
			return bookdao.addBook(bookname, bookAuthor, bookStatus, numberOfBooks, bookrackNo);
	}
	 
	 
}
