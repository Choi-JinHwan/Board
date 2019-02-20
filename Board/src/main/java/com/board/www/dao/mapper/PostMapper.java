package com.board.www.dao.mapper;

import java.util.List;

import com.board.www.dto.PostVO;

public interface PostMapper {
	
	//게시물 생성
	public boolean insertPost(PostVO post);
		
	//게시물 조회
	public List<PostVO> selectPostList();
	public PostVO selectPost(int postId);
	
	//게시물 수정
	public boolean updatePost(PostVO post);
	
	//게시물 삭제
	public boolean deletePost(int postId);
	public void updateViewCount(int postId);
	
}
