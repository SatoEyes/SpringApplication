package com.example.BulletinBoard.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.BulletinBoard.domain.Entity.BBS;
import com.example.BulletinBoard.domain.Repository.BBSMapper;
@SpringBootApplication
@MapperScan("com.example.BulletinBoard.domain.Repository")
@Controller
public class BBSController {
	
	public static void main(String[] args) {
		SpringApplication.run(BBSController.class, args);
	}
	
	@Autowired
	BBSMapper mapper;
	
	// @Autowired
	BBS bbs;
	
	// 一覧画面
	@GetMapping("/")
	public String list(Model model) {
		List<BBS> list = mapper.findAll();
		model.addAttribute("data", list);
		return "BulletinBoard/list";
	}
	
	// 新規登録画面
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("formModel", bbs);
		return "BulletinBoard/new";
	}
	
	// 登録処理
	@PostMapping("/create")
	@Transactional(readOnly=false)
	public String create(
			Model model,
			@ModelAttribute("formModel") BBS bbs) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		bbs.setCreateDate(sdf.format(date));		
		mapper.create(bbs);
		return "BulletinBoard/list";
	}
	
	// 詳細画面
	@GetMapping("/detail")
	public String show(
			Model model,
			@RequestParam int id) {
		bbs = mapper.findById(id);
		model.addAttribute("formModel", bbs);
		return "BulletinBoard/show";
	}
	
	// 編集画面
	@GetMapping("/edit")
	public String edit(
			Model model,
			@RequestParam int id) {
		bbs = mapper.findById(id);
		model.addAttribute("formModel", bbs);
		return "BulletinBoard/edit";
	}
	
	// 更新処理
	@PostMapping("/update")
	@Transactional(readOnly=false)
	public String update(
			Model model,
			@ModelAttribute("formModel") BBS bbs) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			bbs.setCreateDate(sdf.format(date));
			mapper.update(bbs);
			return "BulletinBoard/list";
	}
	
	// 削除処理
	@PostMapping("/delete")
	@Transactional(readOnly=false)
	public String delete(
			Model model,
			@RequestParam int id) {
			mapper.delete(id);
			return "BulletinBoard/list";
	}	
}
