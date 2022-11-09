package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;

@RestController // annotation
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		programmingLanguageService.delete(deleteProgrammingLanguageRequest);
	}

	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		programmingLanguageService.update(updateProgrammingLanguageRequest);
	}

	@GetMapping("/getbyid")
	public GetProgrammingLanguageByIdResponse getById(@RequestParam int id) {
		return programmingLanguageService.getById(id);

//			Swagger-ui kullanımı için bu dependency gereklı unutmaa sonra saatlerin boşa gider utancından soru bile soramazsın dc ye demedi deme
//	<dependency> <groupId>org.springdoc</groupId> <artifactId>springdoc-openapi-ui</artifactId> <version>1.6.6</version></dependency>	
	}
}
