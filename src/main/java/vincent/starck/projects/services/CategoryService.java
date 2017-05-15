package vincent.starck.projects.services;

import org.springframework.data.mongodb.repository.MongoRepository;

import vincent.starck.projects.model.Category;

public interface CategoryService extends MongoRepository<Category,String> {
	
	
}
