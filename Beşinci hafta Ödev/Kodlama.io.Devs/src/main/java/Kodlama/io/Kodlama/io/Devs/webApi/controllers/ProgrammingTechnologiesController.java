package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingTechnologyService;
import Kodlama.io.Kodlama.io.Devs.business.requests.CreateProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.DeleteProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.UpdateProgrammingTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetAllProgrammingTechnologyResponse;
import Kodlama.io.Kodlama.io.Devs.business.responses.GetByIdProgrammingTechnologyResponse;

@RestController
@RequestMapping("/api/programmingtechnologies")
public class ProgrammingTechnologiesController {
	private ProgrammingTechnologyService programmingTechnologyService;

	public ProgrammingTechnologiesController(ProgrammingTechnologyService programmingTechnologyService) {
		super();
		this.programmingTechnologyService = programmingTechnologyService;
	}
	
	@PostMapping("/add")
	public void add(@RequestParam CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) {
		programmingTechnologyService.add(createProgrammingTechnologyRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest) {
		programmingTechnologyService.delete(deleteProgrammingTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestParam UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest) {
		programmingTechnologyService.update(updateProgrammingTechnologyRequest);
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingTechnologyResponse> getAll() {
		return programmingTechnologyService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingTechnologyResponse getById(@RequestParam int id) {
		return programmingTechnologyService.getById(id);
	}
}
