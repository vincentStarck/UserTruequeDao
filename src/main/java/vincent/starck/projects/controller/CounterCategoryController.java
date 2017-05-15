package vincent.starck.projects.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import vincent.starck.projects.model.CounterCategory;
import vincent.starck.projects.services.CounterCategoryService;

@Controller
@RequestMapping("/api")
public class CounterCategoryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CounterCategoryController.class);
	private static final String KEY_CATEGORY_SEQ = "keyCategory";
	@Autowired
	private CounterCategoryService counterCategoryService;

	@RequestMapping(value = "/startCount", method = RequestMethod.POST)
	public @ResponseBody void newCategory() {
	
		CounterCategory counter = counterCategoryService.getById(KEY_CATEGORY_SEQ);
		if (counter == null) {			
			counter = new CounterCategory();
			counter.setId(KEY_CATEGORY_SEQ);
			counter.setSeq(0);
			counterCategoryService.save(counter);
			LOGGER.info("Initializing Counter success:\n{}", new Gson().toJson(counter));

		}
		else{			
			LOGGER.info("Counter already exist");
		}

	}

}
