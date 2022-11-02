package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;
//.....dao gibi -- dataaccessobject

import java.util.List;


import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
// getAll ı cagıran bırı derslerı lısteler...
	List<ProgrammingLanguage> getAll();
	
	// ekle sil guncelle 
	public ProgrammingLanguage add (ProgrammingLanguage programmingLanguage);
	
	public ProgrammingLanguage delete (ProgrammingLanguage programmingLanguage);
	
	public ProgrammingLanguage upload (ProgrammingLanguage programmingLanguage , String newProgrammingLanguage);
	
	public ProgrammingLanguage findById (ProgrammingLanguage programmingLanguage, int id);
	
}
