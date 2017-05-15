package vincent.starck.projects.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import vincent.starck.projects.services.UsuarioService;
import vincent.starck.projects.model.User;

@Controller
@RequestMapping("/api")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UsuarioService repository;

	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public @ResponseBody void createUser(@RequestBody User user) {
		LOGGER.info("Add new user");
		repository.save(user);
		LOGGER.info("Add new user ok: \n{}", new Gson().toJson(user));

	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable String id) {
		return repository.findById(id);
	}

}
