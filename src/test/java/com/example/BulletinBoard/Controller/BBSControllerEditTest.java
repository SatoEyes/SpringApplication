package com.example.BulletinBoard.Controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

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
 * 編集画面遷移テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerEditTest {

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
	public void TS5_1() throws Exception{
		mockMvc.perform(get("/edit").param("id", "1"))
				.andExpect(status().isOk())
				.andExpect(model().attribute("formModel", mapper.findById(1)))
				.andExpect(view().name("BulletinBoard/edit"));
	}
	
	@Test
	public void TS5_2() throws Exception{
		try {
			mockMvc.perform(get("/edit").param("id", "1"))
					.andExpect(status().isOk())
					.andExpect(model().attribute("formModel", null))
					.andExpect(view().name("BulletinBoard/edit"));
			fail("test failure");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void TS5_3() throws Exception{
			mockMvc.perform(get("/test").param("id", "1"))
					.andExpect(status().isNotFound());
	}
	
	@Test
	public void TS5_4() throws Exception{
			mockMvc.perform(post("/edit").param("id", "1"))
					.andExpect(status().isMethodNotAllowed());			
	}
	
	@Test
	public void TS5_5() throws Exception{
			mockMvc.perform(post("/test").param("id", "1"))
					.andExpect(status().isNotFound());
	}
}
