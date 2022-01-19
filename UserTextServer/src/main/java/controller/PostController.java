package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import mapper.PostMapper;

@Controller
public class PostController {
	
	private List<String> posts = new ArrayList<>();
	
	@Autowired
	private PostMapper postMapper;
	
	@RequestMapping("addPost.json")
	@ResponseBody
	public String addPosts(String post) {	
		postMapper.insertPost(post);
		return "OK";
	}
	
	@RequestMapping("getPosts.json")
	@ResponseBody
	public String getPosts() {
		List<String> posts = postMapper.selectPosts();
		Gson gson = new Gson();
		String result = gson.toJson(posts);
		return result;
	}

}
