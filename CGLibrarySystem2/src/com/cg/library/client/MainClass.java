package com.cg.library.client;

import java.util.Scanner;

import com.cg.library.beans.Book;
import com.cg.library.services.LibraryServices;
import com.cg.library.services.LibraryServicesImpl;

public class MainClass {

	public static void main(String[] args) {
	   LibraryServices services=new LibraryServicesImpl();
	   services.addBook("Mathematics", "R.D. Sharma", "Issued", "3",12);
	   services.addBook("English", "Sherlock Holmes","Available","2",11);
	   services.addMember("Harsh Priya","#142,Park Avenue,New York", "3546532131");
	   services.addMember("Isha", "#123,Sector-8,New York","8766546783");
	   Scanner sc=new Scanner(System.in);
	   int index;
	   System.out.println("Enter the your Choice");
	   System.out.println("Enter 1 for registering the member");
	   System.out.println("Enter 2 for adding Book");
	   System.out.println("Enter 3 for issuing book");
	   System.out.println("Enter 4 for returning Book");
	   System.out.println("Enter 5 for verifying the Member");
	   System.out.println("Enter 6 for Searching the Book");
	   index=sc.nextInt();
	   switch(index) {
	   case 1: services.addMember("Enter Name"+" "+sc.next(),"Enter Address"+sc.next(), "Enter Phone Number"+sc.next());
	                System.out.println("Member Registered ");
	                break;
	   case 2: services.addBook("Enter bookName"+sc.next(),"Book Author Name"+sc.next(),"Book Status"+sc.next(),"Enter Number Of Books"+sc.next()+"Enter the rackno",sc.nextInt());
	                 System.out.println("Book Registered ");
	                 break;
	   case 3: System.out.println("Enter BookId,Enter MemberId");
		             services.issueBook(sc.nextInt(), sc.nextInt());
		             System.out.println("Book Issued");
		            break; 
	   case 4: System.out.println("Enter BookId,Enter MemberId");
	                 services.returnBook(sc.nextInt(), sc.nextInt());
	                 break;
	   case 5:System.out.println("Enter memberId");
	                boolean verifyMember=services.verifyMember(sc.nextInt());
	                if(verifyMember==true)
	                	System.out.println("Member is registered");
	                else
	                	System.out.println("Member not registered");
	                break;
	   case 6: System.out.println("Enter BookID,Enter BookName");
	                 Book book=services.searchBook(sc.nextInt(), sc.next());
	                 System.out.println(book.toString());
	                 break;
	    default : System.out.println("Entered Wrong Choice");
	                     break;
		   }
	}
	
}
	   

