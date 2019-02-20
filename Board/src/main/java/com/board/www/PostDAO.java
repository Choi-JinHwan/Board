package com.board.www;

import java.util.List;

import com.board.www.dto.PostVO;

public interface PostDAO {
	public List<PostVO> getPostList();
	public PostVO getPost(int postId);
	public boolean updatePost(PostVO post);
	public boolean deletePost(int postId);
}
