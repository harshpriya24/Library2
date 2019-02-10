package com.cg.library.daoservices;

import com.cg.library.beans.Book;

public interface BookDAOServices {
   public String updateBookStatus(int bookId,String bookName,String bookStatus);
   public Book getBookDetails(int bookId);
   public Book addBook(String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo);
   
}
