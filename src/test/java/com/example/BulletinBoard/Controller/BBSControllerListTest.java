package com.example.BulletinBoard.Controller;

import static org.junit.jupiter.api.Assertions.fail;
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

import com.example.BulletinBoard.domain.Repository.BBSMapper;

/**
 * 一覧画面遷移テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerListTest {

	MockMvc mockMvc;
		
	@InjectMocks
	BBSController controller;
	
	@Mock
	BBSMapper mapper;
	
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void TS1_1() throws Exception{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(model().attribute("data", mapper.findAll()))
				.andExpect(view().name("BulletinBoard/list"));
	}

	@Test
	public void TS1_2() throws Exception{
		try {	
			mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(model().attribute("data", null))
			.andExpect(view().name("BulletinBoard/list"));
			fail("test failure");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void TS1_3() throws Exception{
			mockMvc.perform(get("/test"))
			.andExpect(status().isNotFound());
	}
	
	@Test
	public void TS1_4() throws Exception{
			mockMvc.perform(post("/"))
			.andExpect(status().isMethodNotAllowed());
	}
	
	@Test
	public void TS1_5() throws Exception{
			mockMvc.perform(post("/test"))
			.andExpect(status().isNotFound());
	}

}
