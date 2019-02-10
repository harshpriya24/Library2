package com.cg.library.beans;

public class Book {
private int bookId;
private String bookName;
 private String bookAuthor;
private String bookStatus;
private  String numberOfBooks;
private int bookrackNo;
 public Book() {}
 
 
public Book(int bookId, String bookname) {
	super();
	this.bookId = bookId;
	this.bookName = bookname;
}


public Book(int bookId) {
	super();
	this.bookId = bookId;
}


public Book(String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo) {
	super();
	this.bookName = bookname;
	this.bookAuthor = bookAuthor;
	this.bookStatus = bookStatus;
	this.numberOfBooks = numberOfBooks;
	this.bookrackNo = bookrackNo;
}

public Book(int bookId, String bookname, String bookAuthor, String bookStatus, String numberOfBooks, int bookrackNo) {
	super();
	this.bookId = bookId;
	this.bookName = bookname;
	this.bookAuthor = bookAuthor;
	this.bookStatus = bookStatus;
	this.numberOfBooks = numberOfBooks;
	this.bookrackNo = bookrackNo;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookAuthor == null) ? 0 : bookAuthor.hashCode());
	result = prime * result + bookId;
	result = prime * result + ((bookStatus == null) ? 0 : bookStatus.hashCode());
	result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	result = prime * result + bookrackNo;
	result = prime * result + ((numberOfBooks == null) ? 0 : numberOfBooks.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (bookAuthor == null) {
		if (other.bookAuthor != null)
			return false;
	} else if (!bookAuthor.equals(other.bookAuthor))
		return false;
	if (bookId != other.bookId)
		return false;
	if (bookStatus == null) {
		if (other.bookStatus != null)
			return false;
	} else if (!bookStatus.equals(other.bookStatus))
		return false;
	if (bookName == null) {
		if (other.bookName != null)
			return false;
	} else if (!bookName.equals(other.bookName))
		return false;
	if (bookrackNo != other.bookrackNo)
		return false;
	if (numberOfBooks == null) {
		if (other.numberOfBooks != null)
			return false;
	} else if (!numberOfBooks.equals(other.numberOfBooks))
		return false;
	return true;
}

public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookname() {
	return bookName;
}
public void setBookname(String bookname) {
	this.bookName = bookname;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookStatus() {
	return bookStatus;
}
public void setBookStatus(String bookStatus) {
	this.bookStatus = bookStatus;
}
public String getNumberOfBooks() {
	return numberOfBooks;
}
public void setNumberOfBooks(String numberOfBooks) {
	this.numberOfBooks = numberOfBooks;
}
public int getBookrackNo() {
	return bookrackNo;
}
public void setBookrackNo(int bookrackNo) {
	this.bookrackNo = bookrackNo;
}

@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookname=" + bookName + ", bookAuthor=" + bookAuthor + ", bookStatus="
			+ bookStatus + ", numberOfBooks=" + numberOfBooks + ", bookrackNo=" + bookrackNo + "]";
}
 
 
 
}
