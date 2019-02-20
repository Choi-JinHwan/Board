package com.board.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.www.service.PostService;

@Controller
public class PostController {
	@Autowired
	PostService postService;
	
	@RequestMapping("/PostList")
	public String postListController(Model model) {
		model.addAttribute("postList",postService.getPostList());
		return "PostList";
	}
	@RequestMapping("/PostView/{postId}")
	public String postViewController(@PathVariable int postId, Model model) {
		model.addAttribute("post",postService.getPost(postId));
		postService.updateViewCount(postId);
		return "PostView";
	}
}
