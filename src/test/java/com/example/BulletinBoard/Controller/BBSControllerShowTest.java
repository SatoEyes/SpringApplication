package com.example.BulletinBoard.Controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.BulletinBoard.domain.Entity.BBS;
import com.example.BulletinBoard.domain.Repository.BBSMapper;

/**
 * 詳細画面遷移テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerShowTest {

	MockMvc mockMvc;
	
	@InjectMocks
	BBSController controller;
	
	@Mock
	BBSMapper mapper;
	
	@Mock
	BBS bbs;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void TS4_1() throws Exception{
		mockMvc.perform(get("/detail").param("id", "1"))
				.andExpect(status().isOk())
				.andExpect(model().attribute("formModel", mapper.findById(1)))
				.andExpect(view().name("BulletinBoard/show"));
	}
	
	@Test
	public void TS4_2() throws Exception{
		try {
			mockMvc.perform(get("/detail").param("id", "1"))
					.andExpect(status().isOk())
					.andExpect(model().attribute("formModel", null))
					.andExpect(view().name("BulletinBoard/show"));
			fail("test failure");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void TS4_3() throws Exception{
			mockMvc.perform(get("/test").param("id", "1"))
					.andExpect(status().isNotFound());
	}
	
	@Test
	public void TS4_4() throws Exception{
			mockMvc.perform(post("/detail").param("id", "1"))
					.andExpect(status().isMethodNotAllowed());			
	}
	
	@Test
	public void TS4_5() throws Exception{
			mockMvc.perform(post("/test").param("id", "1"))
					.andExpect(status().isNotFound());
	}

}
