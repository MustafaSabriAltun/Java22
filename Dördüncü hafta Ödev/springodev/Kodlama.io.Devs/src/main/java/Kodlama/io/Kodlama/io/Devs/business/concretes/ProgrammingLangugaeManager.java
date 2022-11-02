package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLangugaeManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	@Autowired
	public ProgrammingLangugaeManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public ArrayList<ProgrammingLanguage> getAll() {
		// iş kuralları
		return (ArrayList<ProgrammingLanguage>) programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
		// Program ismi boş bırakılamaz hatası
		if (programmingLanguage.getProgrammingLanguage().equals(" ")) {
			throw new Exception ("Program ismi boş bırakılamaz");
		}
		// tekrar edemez KURALINI YAPAMADIM...
		return programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage, String newProgrammingLanguage) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.upload(programmingLanguage, newProgrammingLanguage);
	}

	@Override
	public ProgrammingLanguage findById(ProgrammingLanguage programmingLanguage, int id) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.findById(programmingLanguage, id);
	}

}
