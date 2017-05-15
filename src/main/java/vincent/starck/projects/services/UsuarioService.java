package vincent.starck.projects.services;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import vincent.starck.projects.model.User;


public interface UsuarioService extends MongoRepository<User, String> {

	public User findById(String firstName);

	public List<User> findByLastName(String lastName);

}
