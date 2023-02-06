package com.hasan.daikichiPath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	@RequestMapping("/{action}/{vary}")
	public String handle(@PathVariable("action")String action, @PathVariable("vary")String vary) {
		if(action.equals("travel")) {
			return "Congratulations! You will soon travel to "+vary+"!";
		}
		else if(action.equals("lotto")) {
			int x = Integer.parseInt(vary);
			if(x%2==0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			} else {
				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
		} else return "needs better input";
	}
}