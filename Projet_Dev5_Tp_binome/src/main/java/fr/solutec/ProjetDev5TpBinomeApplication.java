package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import fr.solutec.entities.Memo;
import fr.solutec.entities.User;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.UserRepository;
import java.util.Date;

@SpringBootApplication
public class ProjetDev5TpBinomeApplication implements CommandLineRunner{
	
	// Commentaire Adrien
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MemoRepository memoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetDev5TpBinomeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Lancement terminé");
		
		User guillaume = new User(null, "Pebrier", "Guillaume", "login1", "password1");
		User mohammed = new User(null, "Amara", "Mohammed", "login2", "password2");
		
		userRepo.save(guillaume);
		userRepo.save(mohammed);

		memoRepo.save(new Memo(null, "Contenu1", "2021-01-20", guillaume, mohammed, false));
		memoRepo.save(new Memo(null, "Contenu2", "2021-11-18", guillaume, guillaume, false));
		memoRepo.save(new Memo(null, "Contenu3", "2022-05-20", mohammed, mohammed, false));
		
		
		
	}

}
