package com.board.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
	@Autowired
	PostService postService;
	
	@RequestMapping("/PostList")
	public String postListController(Model model) {
		model.addAttribute("postList",postService.getPostList());
		return "list";
	}

}
