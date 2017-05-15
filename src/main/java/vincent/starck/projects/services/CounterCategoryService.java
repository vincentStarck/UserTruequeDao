package vincent.starck.projects.services;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import vincent.starck.projects.model.CounterCategory;

public interface CounterCategoryService extends MongoRepository<CounterCategory,String> {
	public CounterCategory getById(String id);
	public List<CounterCategory> findAll();

}
