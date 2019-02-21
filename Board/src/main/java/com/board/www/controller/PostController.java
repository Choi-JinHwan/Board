package com.board.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.www.dto.PostVO;
import com.board.www.service.PostService;

@Controller
public class PostController {
	@Autowired
	PostService postService;
	
	//게시물 목록 조회
	@RequestMapping("/PostList")
	public String postListController(Model model) {
		//게시물 목록을 받아 모델에 넣는다.
		model.addAttribute("postList",postService.getPostList());
		return "PostList";
	}
	
	//게시물 조회
	@RequestMapping("/PostView/{postId}")
	public String postViewController(@PathVariable int postId, Model model) {
		//게시물을 받아 모델에 넣는다.
		model.addAttribute("post",postService.getPost(postId));
		//해당 게시물의 조회수를 상승시킨다.
		postService.updateViewCount(postId);
		return "PostView";
	}
	
	//게시물 수정 폼으로 이동
	@RequestMapping("/PostUpdate/{postId}")
	public String postUpdateWriter(@PathVariable int postId, Model model) {
		model.addAttribute("post", postService.getPost(postId));
		return "PostUpdate";
	}
	
	@RequestMapping("/PostUpdate")
	public String postUpdate(
			Model model, 
			@RequestParam String title, 
			@RequestParam String contents, 
			@RequestParam String postId
			) {
		PostVO post = new PostVO();
		post.setPostId(Integer.valueOf(postId));
		post.setContents(contents);
		post.setTitle(title);
		
		postService.updatePost(post);
		
		return "PostList";
		
	}
}
