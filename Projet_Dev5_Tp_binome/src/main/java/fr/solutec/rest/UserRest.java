package fr.solutec.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@RestController @CrossOrigin("*")

public class UserRest {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("login")
	public Optional <User> getLoginAndPassword(@RequestBody User u) {			
		return userRepo.findByLoginAndPassword(u.getLogin(),u.getPassword());					
	}	
}
//test1
