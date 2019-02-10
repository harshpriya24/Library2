package com.cg.library.daoservices;

import com.cg.library.beans.Member;

public interface MemberDAOServices {
  public int increaseBookIssuedCount(int bookId,int memberId);
  public int decreaseBookIssuedCount(int bookId,int memberId);
  public Member registerNewMember(String memberName, String memberAddress,String memberPhone);
}
