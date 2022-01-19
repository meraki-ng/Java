package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class UserController {

	private List<String> users = new ArrayList<>();

	@RequestMapping("addUser.json")
	@ResponseBody
	public String addUsers(String user) {	
		users.add(user);
		return "OK";
	}
	
	@RequestMapping("getUsers.json")
	@ResponseBody
	public String getUsers() {
		Gson gson = new Gson();
		String result = gson.toJson(users);
		return result;
	}
}
