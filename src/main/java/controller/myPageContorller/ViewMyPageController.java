package controller.myPageContorller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ViewMyPageController {
	
	@RequestMapping("myPage")
	public String viewMyPage() {
		return "myPage";
	}

}
