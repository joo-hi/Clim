package com.playus.clim.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.playus.clim.vo.Bookmark;

@Repository
public class BookmarksDAOImpl implements BookmarksDAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<Bookmark> mybookmarkListForCliming(int memberNo) {
		return session.selectList("bookmarks.mybookmarkListForCliming", memberNo);
	}
	@Override
	public void insertClimingList(Bookmark bookmark) {
		// TODO Auto-generated method stub
		session.insert("bookmarks.insertClimingList", bookmark);
	}
	
	@Override
	public List<Bookmark> mybookmarkListForMovies(int memberNo) {
		// TODO Auto-generated method stub
		return session.selectList("bookmarks.mybookmarkListForMovies", memberNo);
	}
	
	@Override
	public int deletMybookmarkMovie(int no) {
		// TODO Auto-generated method stub
		return session.delete("deleteMybookmarkMovie",no);
	}

}
