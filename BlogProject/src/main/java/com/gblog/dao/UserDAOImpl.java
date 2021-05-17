package com.gblog.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gblog.dto.UserDTO;


@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession sqlSession;
	//회원가입
	@Override
	public void insertUser(UserDTO udto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("insertUser", udto);
		
	}
	//아이디 중복확인
	@Override
	public int idcheck(UserDTO udto) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("idcheck",udto);
	}
	

	
}
