package vincent.starck.projects.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import vincent.starck.projects.model.Category;
import vincent.starck.projects.services.CategoryService;

@Controller
@RequestMapping("/api")
public class CategoryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/newCategory", method = RequestMethod.POST)
	public @ResponseBody void newCategory(@RequestBody Category category) {
		LOGGER.info("add new Category \n{}",new Gson().toJson(category));
		categoryService.save(category);
		LOGGER.info("Add new Category ok: \n{}", new Gson().toJson(category));

	}

	@RequestMapping(value = "/getAllCategories", method = RequestMethod.GET)
	public @ResponseBody List<Category> getCategories() {
		return categoryService.findAll();
	}

}
