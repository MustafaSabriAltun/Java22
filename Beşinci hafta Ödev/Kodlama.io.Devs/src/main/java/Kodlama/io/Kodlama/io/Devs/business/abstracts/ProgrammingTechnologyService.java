package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingTechnologyResponse;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetByIdProgrammingTechnologyResponse;

public interface ProgrammingTechnologyService {
	void add(CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest);
	void delete(DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest);
	void update(UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest);
	
	List<GetAllProgrammingTechnologyResponse> getAll();
	GetByIdProgrammingTechnologyResponse getById(int id);
}
