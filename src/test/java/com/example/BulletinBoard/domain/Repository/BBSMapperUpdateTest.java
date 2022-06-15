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
 * 更新テスト
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
public class BBSMapperUpdateTest {

	@Autowired
	private BBSMapper mapper;
	
	int no = 0;
	
	@Test
	public void TS3_1() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_2() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_3() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_4() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_5() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_6() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	
	@Test
	public void TS3_7() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_8() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_9() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_10() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_11() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_12() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_13() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_14() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_15() {
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_16() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate(null);
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_17() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_18() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_19() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_20() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_21() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_22() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_23() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_24() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle(null);
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_25() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_26() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_27() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_28() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent(null);
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_29() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_30() throws DataAccessException{
		Assertions.assertThrows(DataAccessException.class, () ->{
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser(null);
			no = 2;
			bbs.setId(no);
			if(no != 0) {
				mapper.update(bbs);
				fail("Not Null,check制約に違反します");
			}
			fail();
		});
	}
	
	@Test
	public void TS3_31() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			bbs.setId(no);
			if(mapper.findById(no) != null) {
				mapper.update(bbs);
				fail();
			}
	}
	
	@Test
	public void TS3_32() {
			BBS bbs = new BBS();
			bbs.setCreateDate("2022/6/7");
			bbs.setTitle("掲示板アプリケーション");
			bbs.setContent("テスト・機能改修");
			bbs.setCreateUser("田中");
			no = 2;
			bbs.setId(no);
			try {
				mapper.create(bbs);
			}catch(Exception e) {
				fail(e.getMessage());
			}
	}
}
