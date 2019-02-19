package com.board.www.dao.mapper;

import java.util.List;

import com.board.www.dto.PostVO;

public interface PostMapper {
	public List<PostVO> selectPostList();
	public PostVO selectPost();
}
