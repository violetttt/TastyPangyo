package tp.dao.service;

import java.util.Date;
import java.util.List;

import tp.exception.DuplicatedIdException;
import tp.exception.LoginFailException;
import tp.exception.MemberNotFoundException;
import tp.vo.Member;

public interface MemberDaoService {
	String insertMember(Member member) throws DuplicatedIdException, LoginFailException;
	String updateMember(Member member) throws MemberNotFoundException;
	String deleteMember(String memberId) throws MemberNotFoundException;
	String deleteMemberByVisitDate(Date visitDate) throws MemberNotFoundException;
	List<Member> selectAllMember();
	int selectMemberCount();
	Member selectMemberById(String memberId);
	List<Member> selectMemberByVisitDate(Date visitDate);
}
