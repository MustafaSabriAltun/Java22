package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;
		
	public InMemoryProgrammingLanguageRepository() {
		
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		
		programmingLanguages.add(new ProgrammingLanguage(1, "JAVA"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, "PYTHON"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		programmingLanguage.setId(ProgrammingLanguage.getCounter()+1);
		return programmingLanguage;
	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage.getId());
		return programmingLanguage;
	}

	@Override
	public ProgrammingLanguage upload(ProgrammingLanguage programmingLanguage, String newProgrammingLanguage) {
		programmingLanguage.setProgrammingLanguage(newProgrammingLanguage);
		return programmingLanguage;
	}

	@Override
	public ProgrammingLanguage findById(ProgrammingLanguage programmingLanguage, int id) {
/* bu kısmı ben yazamadım InciGylcinDY isimli github profilinden aldım kodu okuyunca ne yaptığını anlasam da aradan zaman geçtiğinde aynı kodu yazamıyorum halaaaa
 * bu bi tık beni sinirlendiriyor fakat halledeceğim.
		for (ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if(programmingLanguage2.getId() == id) {
				programmingLanguage.setProgrammingLanguage(programmingLanguage2.getProgrammingLanguage());;
			}
		}
*/
		return programmingLanguage;
	}

}
