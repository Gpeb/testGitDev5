package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public Optional <User> findByLoginAndPassword(String login, String password);
	
	//@Query(value = "SELECT u FROM User u WHERE u.login = ?1 AND u.password = ?2")
	//public List<User> getUserByNom(String nom);
	
	
}
