package com.springlec.base0302;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//이거안쓰면 그냥 클라스다
@RequestMapping("test")
public class myController {
	
	@RequestMapping("/view1")
	public String view1() {
		return "test/view1";
	}

}
