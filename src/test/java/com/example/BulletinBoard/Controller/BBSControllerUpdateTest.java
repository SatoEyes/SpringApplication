package com.example.BulletinBoard.Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
 * 更新処理テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerUpdateTest {

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
	public void TS6_1() throws Exception{
		mockMvc.perform(post("/update")
				.param("title", "title")
				.param("content", "content")
				.param("createUser", "createUser"))
				.andExpect(status().isOk())
				.andExpect(view().name("BulletinBoard/list"));
				
	}
	
	@Test
	public void TS6_2() throws Exception{
			mockMvc.perform(post("/test"))
					.andExpect(status().isNotFound());
	}
	
	@Test
	public void TS6_3() throws Exception{
			mockMvc.perform(get("/update"))
					.andExpect(status().isMethodNotAllowed());
	}
	
	@Test
	public void TS6_4() throws Exception{
			mockMvc.perform(get("/test"))
					.andExpect(status().isNotFound());
	}

}
