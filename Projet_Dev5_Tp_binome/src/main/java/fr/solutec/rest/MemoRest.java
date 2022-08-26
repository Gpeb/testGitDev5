package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;


@RestController @CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepo;
	
	@GetMapping("memo/user/{id}")
	public Optional<Memo> getAllMemo(@PathVariable Long id) {
		return memoRepo.findById(id);
	}
	
	@GetMapping("memo")
	public Iterable<Memo> getAllMemo() {
		return memoRepo.findAll();
	}
	
	@PostMapping("memo")
	public Memo saveMemo(@RequestBody Memo m) {
		return memoRepo.save(m);
	}
	
	@DeleteMapping("memo/{idMemo}")
	public boolean deletePerson(@PathVariable Long idMemo) {
		
		Optional <Memo> m = memoRepo.findById(idMemo);
		if(m.isPresent()) {
			memoRepo.deleteById(idMemo);
			return true;
		}else {
			return false;
		}			
	}
	
	
	
}
