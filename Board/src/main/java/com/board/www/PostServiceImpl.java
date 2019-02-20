package com.board.www;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.www.dto.PostVO;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostDAO postDao;
	
	@Override
	public List<PostVO> getPostList() {
		
		return postDao.getPostList();
	}

	@Override
	public PostVO getPost(int postId) {
		
		return postDao.getPost(postId);
	}

	@Override
	public boolean updatePost(PostVO post) {
		
		return postDao.updatePost(post);
	}

	@Override
	public boolean deletePost(int postId) {
		
		return postDao.deletePost(postId);
	}
	
	

	

}
