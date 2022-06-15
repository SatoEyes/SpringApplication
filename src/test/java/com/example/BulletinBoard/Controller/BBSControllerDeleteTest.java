package com.example.BulletinBoard.Controller;

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
 * 削除処理テスト
 * @author sato.hitomi
 *
 */
@ExtendWith(SpringExtension.class)
public class BBSControllerDeleteTest {

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
	public void TS7_1() throws Exception{
		mockMvc.perform(post("/delete").param("id", "2"))
				.andExpect(status().isOk())
				.andExpect(view().name("BulletinBoard/list"));
	}
	
	@Test
	public void TS7_2() throws Exception{
			mockMvc.perform(post("/test").param("id", "2"))
					.andExpect(status().isNotFound());
	}
	
	@Test
	public void TS7_3() throws Exception{
			mockMvc.perform(get("/delete").param("id", "2"))
					.andExpect(status().isMethodNotAllowed());			
	}
	
	@Test
	public void TS7_4() throws Exception{
			mockMvc.perform(get("/test").param("id", "2"))
					.andExpect(status().isNotFound());
	}

}
