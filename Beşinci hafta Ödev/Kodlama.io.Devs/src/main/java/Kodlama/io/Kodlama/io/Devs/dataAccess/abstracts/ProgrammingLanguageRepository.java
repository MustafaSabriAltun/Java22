package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{
//ppp
	List<ProgrammingLanguage> findAllById(int id);
	
	List<ProgrammingLanguage> findAllByName(String name);

	ProgrammingLanguage findById(int id);

	ProgrammingLanguage findByName(String name);
	
}
