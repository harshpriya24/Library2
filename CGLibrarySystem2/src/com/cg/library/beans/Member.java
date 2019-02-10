package com.cg.library.beans;

public class Member {
 private int memberId;
 private String memberName;
private int memberBookId;
private int countBook=0;
private String memberAddress;
private String memberPhone;
 public Member() {}

public Member(int memberId) {
	super();
	this.memberId = memberId;
}

public Member(String memberName, String memberAddress, String memberPhone) {
	super();
	this.memberName = memberName;
	this.memberAddress = memberAddress;
	this.memberPhone = memberPhone;
}

public Member(String memberName, int memberBookId) {
	super();
	this.memberName = memberName;
	this.memberBookId = memberBookId;
}


public Member(int memberId, String memberName, int memberBookId) {
	super();
	this.memberId = memberId;
	this.memberName = memberName;
	this.memberBookId = memberBookId;
}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public int getMemberBookId() {
	return memberBookId;
}
public void setMemberBookId(int memberBookId) {
	this.memberBookId = memberBookId;
}

public int getCountBook() {
	return countBook;
}

public void setCountBook(int countBook) {
	this.countBook = countBook;
}

public String getMemberAddress() {
	return memberAddress;
}

public void setMemberAddress(String memberAddress) {
	this.memberAddress = memberAddress;
}

public String getMemberPhone() {
	return memberPhone;
}

public void setMemberPhone(String memberPhone) {
	this.memberPhone = memberPhone;
}

@Override
public String toString() {
	return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberBookId=" + memberBookId
			+ ", countBook=" + countBook + ", memberAddress=" + memberAddress + ", memberPhone=" + memberPhone + "]";
}
 
}
