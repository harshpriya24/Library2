package com.cg.library.services;

import com.cg.library.beans.Book;
import com.cg.library.beans.Member;

public interface LibraryServices {
 public Book issueBook(int bookId,int memberId);
 public Book returnBook(int bookId,int memberId);
 public  boolean verifyMember(int memberId) ;
 public Book searchBook(int bookId,String bookName) ;
 public Member addMember(String memberName, String memberAddress,String memberPhone);
 public Book addBook(String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo);
		
}
