package com.example.BulletinBoard.domain.Repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.example.BulletinBoard.domain.Entity.BBS;

/**
 * 編集、詳細テスト
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
public class BBSMapperEditTest {
	
	@Autowired
	private BBSMapper mapper;
	
	@Test
	public void TS2_1() {
		BBS bbs = mapper.findById(0);
		if(bbs != null) {
			fail();
		}
		// id=0は0件であることが正常
	}
	
	@Test
	public void TS2_2() {
		BBS bbs = mapper.findById(2);
		if(bbs == null) {
			fail();
		}
	}

}
