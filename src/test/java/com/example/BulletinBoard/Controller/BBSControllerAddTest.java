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
 * 登録画面遷移テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerAddTest {

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
	public void TS2_1() throws Exception{
		mockMvc.perform(get("/add"))
				.andExpect(status().isOk())
				.andExpect(model().attribute("formModel", bbs))
				.andExpect(view().name("BulletinBoard/new"));
	}
	
	@Test
	public void TS2_2() throws Exception{
		try {
			mockMvc.perform(get("/add"))
				.andExpect(status().isOk())
				.andExpect(model().attribute("formModel", null))
				.andExpect(view().name("BulletinBoard/new"));
			fail("test failure");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void TS2_3() throws Exception{
			mockMvc.perform(get("/test"))
			.andExpect(status().isNotFound());
	}

	@Test
	public void TS2_4() throws Exception{
			mockMvc.perform(post("/"))
			.andExpect(status().isMethodNotAllowed());
	}
	
	@Test
	public void TS2_5() throws Exception{
			mockMvc.perform(post("/test"))
			.andExpect(status().isNotFound());
	}
}
