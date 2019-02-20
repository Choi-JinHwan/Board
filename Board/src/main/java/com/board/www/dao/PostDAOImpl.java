package com.board.www.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.www.dao.mapper.PostMapper;
import com.board.www.dto.PostVO;

@Repository
public class PostDAOImpl implements PostDAO {
	
	@Autowired
	PostMapper postMapper;

	@Override
	public List<PostVO> getPostList() {
		
		return postMapper.selectPostList();
	}

	@Override
	public PostVO getPost(int PostId) {
		
		return postMapper.selectPost(PostId);
	}

	@Override
	public boolean updatePost(PostVO post) {
		
		return postMapper.updatePost(post);
	}

	@Override
	public boolean deletePost(int postId) {
		
		return postMapper.deletePost(postId);
	}

	@Override
	public void updateViewCount(int postId) {
		postMapper.updateViewCount(postId);
		
	}



}
