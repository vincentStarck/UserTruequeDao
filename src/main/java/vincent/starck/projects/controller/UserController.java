package vincent.starck.projects.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vincent.starck.projects.services.UsuarioService;
import vincent.starck.projects.model.User;


@Controller
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UsuarioService repository;
	
	   @RequestMapping(value = "/user",method=RequestMethod.POST)
	    public @ResponseBody void  createUser(@RequestBody User user) {
		   repository.save(user);
	        
	    }
	   
	   @RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	   public @ResponseBody User getUserById(@PathVariable String id){
		   System.out.println(id);
		   return repository.findById(id);
	   }

}
