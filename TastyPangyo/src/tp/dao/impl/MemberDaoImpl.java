package tp.dao.impl;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import tp.dao.MemberDao;
import tp.vo.Member;

public class MemberDaoImpl implements MemberDao{

	private static MemberDaoImpl instance;
	private MemberDaoImpl(){}
	public static MemberDaoImpl getInstance(){
		if(instance == null) instance = new MemberDaoImpl();
		return instance;
	}
	
	String sql = "config.mapper.mapper.";
	
	@Override
	public String insertMember(SqlSession session, Member member) {
		return session.selectOne(sql+"insertMember", member);
	}

	@Override
	public String updateMember(SqlSession session, Member member) {
		return session.selectOne(sql+"updateMember", member);
	}

	@Override
	public String deleteMember(SqlSession session, String memberId) {
		return session.selectOne(sql+"deleteMember", memberId);
	}

	@Override
	public String deleteMemberByVisitDate(SqlSession session, Date visitDate) {
		return session.selectOne(sql+"deleteMemberByVisitDate", visitDate);
	}

	@Override
	public List<Member> selectAllMember(SqlSession session) {
		return session.selectList(sql+"selectAllMember");
	}

	@Override
	public int selectMemberCount(SqlSession session) {
		// 회원목록 보여줄 때 필요
		return session.selectOne(sql+"selectMemberCount");
	}
	@Override
	public Member selectMemberById(SqlSession session, String memberId) {
		return session.selectOne(sql+"selectMemberById", memberId);
	}

	@Override
	public List<Member> selectMemberByVisitDate(SqlSession session, Date visitDate) {
		return session.selectList(sql+"selectMemberByVisitDate", visitDate);
	}

	
}
