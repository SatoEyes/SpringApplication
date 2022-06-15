package com.example.BulletinBoard.domain.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.BulletinBoard.domain.Entity.BBS;

@Mapper
public interface BBSMapper {
	List<BBS> findAll();
	void create(BBS bbs);
	BBS findById(int id);
	void update(BBS bbs);
	void delete(int id);
}
