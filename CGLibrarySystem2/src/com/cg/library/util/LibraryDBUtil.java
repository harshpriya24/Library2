package com.cg.library.util;

import java.util.HashMap;

import com.cg.library.beans.Book;
import com.cg.library.beans.Member;

public class LibraryDBUtil {

	public static HashMap<Integer, Book> books=new HashMap<>();
	public static int BOOK_ID_COUNTER=100;
	public static int getBOOK_ID_COUNTER() {
		return ++BOOK_ID_COUNTER;
}
	public static HashMap<Integer, Member>member=new HashMap<>();
	public static int MEMBER_ID_COUNTER=100;
	public static int getMEMBER_ID_COUNTER() {
		return ++MEMBER_ID_COUNTER;
	}
}