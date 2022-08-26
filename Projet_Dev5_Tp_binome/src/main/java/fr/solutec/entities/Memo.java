package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor @AllArgsConstructor @Data
@Entity	
public class Memo {
	@Id @GeneratedValue
	private Long idMemo;
	private String contenu;
	private String date;
	@ManyToOne
	private User userEmetteur;	
	@ManyToOne
	private User userDestinataire;
	private boolean forAllUsers;
}
