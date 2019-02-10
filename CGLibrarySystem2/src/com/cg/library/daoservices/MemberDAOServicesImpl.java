package com.cg.library.daoservices;

import com.cg.library.beans.Member;
import com.cg.library.util.LibraryDBUtil;

public class MemberDAOServicesImpl implements MemberDAOServices {

	@Override
	public int increaseBookIssuedCount(int bookId, int memberId) {
		Member member=new Member(memberId);
	  int count=member.getCountBook();
		return count++;		
	}

	@Override
	public int decreaseBookIssuedCount(int bookId, int memberId) {

		Member member=new Member(memberId);
		  int count=member.getCountBook();
			return count--;		
	}

	@Override
	public Member registerNewMember(String memberName, String memberAddress,String memberPhone) {
	Member member=new Member(memberName, memberAddress, memberPhone);
	member.setMemberId(LibraryDBUtil.getMEMBER_ID_COUNTER());
	return member ;
	}

}
