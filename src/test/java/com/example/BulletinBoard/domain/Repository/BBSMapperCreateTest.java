package com.example.BulletinBoard.domain.Repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.example.BulletinBoard.domain.Entity.BBS;

/**
 * 登録テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestExecutionListeners({
	DependencyInjectionTestExecutionListener.class,
	TransactionalTestExecutionListener.class})
@Transactional
public class BBSMapperCreateTest {

	@Autowired
	private BBSMapper mapper;
	
	@Test
	public void TS1_1() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_2() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_3() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_4() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_5() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板作成");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_6() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板作成");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_7() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板作成");
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_8() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板作成");
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_9() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_10() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_11() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle(null);
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_12() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle(null);
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_13() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle("掲示板作成");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_14() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle("掲示板作成");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_15() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle("掲示板作成");
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser(null);
			mapper.create(bbs);
			fail("Not Null,check制約に違反します");
		});		
	}
	
	@Test
	public void TS1_16() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/6");
			bbs.setTitle("掲示板作成");
			bbs.setContent("設計・コード作成");
			bbs.setCreateUser("田中");
			try {
				mapper.create(bbs);
			}catch(Exception e) {
				fail(e.getMessage());
			}
	}

}
