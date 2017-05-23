package tp.dao.impl.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import tp.dao.MemberDao;
import tp.dao.impl.MemberDaoImpl;
import tp.dao.service.MemberDaoService;
import tp.util.SqlSessionFactoryManager;
import tp.vo.Member;

public class MemberDaoImplService implements MemberDaoService{
	private static MemberDaoImplService instance;
	private MemberDaoImplService(){};
	public static MemberDaoImplService getInstance(){
		if(instance == null) instance = new MemberDaoImplService();
		return instance;
	}
	
	SqlSession session = null;
	MemberDao dao = MemberDaoImpl.getInstance();
	

		@Override
		public String insertMember(Member member){
			 
			if(selectMemberById(member.getMemberId()) != null){
				return "이미 존재하는 ID입니다";
			}
			dao.insertMember(session, member);
			return "가입완료!";
	
		}
	
		@Override
		public String updateMember(Member member){
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public String deleteMember(String memberId){
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public String deleteMemberByVisitDate(Date visitDate){
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public List<Member> selectAllMember() {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public int selectMemberCount() {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public Member selectMemberById(String memberId) {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public List<Member> selectMemberByVisitDate(Date visitDate) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
