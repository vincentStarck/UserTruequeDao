package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.User;
import services.UsuarioService;


@Controller
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UsuarioService repository;
	
	   @RequestMapping(value = "/user/",method=RequestMethod.POST)
	    public @ResponseBody void  createUser(@RequestBody User user) {
		   repository.save(user);
	        
	    }

}
