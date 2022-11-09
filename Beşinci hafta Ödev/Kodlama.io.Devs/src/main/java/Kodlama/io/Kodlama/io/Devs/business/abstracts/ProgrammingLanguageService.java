package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguageResponse> getAll();
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
    void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
    
    GetProgrammingLanguageByIdResponse getById(int id);
}
