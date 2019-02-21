package com.board.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.www.dao.PostDAO;
import com.board.www.dto.PostVO;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostDAO postDao;
	
	@Override	//게시물 목록 조회
	public List<PostVO> getPostList() {
		
		return postDao.getPostList();
	}

	@Override	//게시물 조회
	public PostVO getPost(int postId) {
		
		return postDao.getPost(postId);
	}

	@Override	//게시물 수정
	public boolean updatePost(PostVO post) {
		
		return postDao.updatePost(post);
	}

	@Override	//게시물 삭제
	public boolean deletePost(int postId) {
		
		return postDao.deletePost(postId);
	}

	@Override	//게시물 조회수 상승
	public void updateViewCount(int postId) {
		
		postDao.updateViewCount(postId);
	}

	

	

}
