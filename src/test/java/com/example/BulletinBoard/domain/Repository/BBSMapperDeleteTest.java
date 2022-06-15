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

/**
 * 削除テスト
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
public class BBSMapperDeleteTest {
	
	@Autowired 
	private BBSMapper mapper;

	@Test
	public void TS4_1() {
		int no = 0;
		if(no != 0){
			mapper.delete(no);
			fail();
		}
	}
	
	@Test
	public void TS4_2() {
		int no = 3;
		if(no == 0) {
			fail();
		}
		mapper.delete(no);
	}
}
