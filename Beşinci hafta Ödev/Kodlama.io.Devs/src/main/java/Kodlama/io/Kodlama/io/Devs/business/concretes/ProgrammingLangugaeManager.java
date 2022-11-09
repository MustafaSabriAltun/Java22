package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLangugaeManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLangugaeManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {

		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());

			programmingLanguagesResponse.add(responseItem);
		}

		return programmingLanguagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest)  {
		for (ProgrammingLanguage _programmingLanguga : programmingLanguageRepository.findAll()) {
			if (_programmingLanguga.getName().equalsIgnoreCase(createProgrammingLanguageRequest.getName())) {
				System.out.println(" Aynı isimde başka bir program zaten mevcut. ");
			}
		}
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void delete (DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(deleteProgrammingLanguageRequest.getName());
		
		programmingLanguageRepository.delete(programmingLanguage);
		
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		if (updateProgrammingLanguageRequest.getName().isBlank() || updateProgrammingLanguageRequest.getName().isEmpty()) {
			System.out.println("Program isimleri en az bir karakter içermek zorundadır.");
		} else {
			for (ProgrammingLanguage _programmingLanguage : programmingLanguageRepository.findAll()) {

				if (_programmingLanguage.getName().equalsIgnoreCase(updateProgrammingLanguageRequest.getName())) {
					System.out.println(" Bu isimde bir program zaten var: " + updateProgrammingLanguageRequest.getName());
				}
			}
		}
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(updateProgrammingLanguageRequest.getId());
		programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	

	@Override
	public GetProgrammingLanguageByIdResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id);
		GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse= new GetProgrammingLanguageByIdResponse();
		getProgrammingLanguageByIdResponse.setId(programmingLanguage.getId());
		getProgrammingLanguageByIdResponse.setName(programmingLanguage.getName());
		
		return getProgrammingLanguageByIdResponse;
	}



	
	
}
