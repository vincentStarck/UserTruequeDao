package services;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import hello.User;


public interface UsuarioService extends MongoRepository<User, String> {

	public User findByFirstName(String firstName);

	public List<User> findByLastName(String lastName);

}
