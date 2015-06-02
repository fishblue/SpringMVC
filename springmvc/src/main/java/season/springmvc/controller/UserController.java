package season.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@RequestMapping("index")
    public String index(){
		if(logger.isDebugEnabled()){
			logger.debug("�����˷���UserController��index������");
		}
		return "index";
    }
	
}
