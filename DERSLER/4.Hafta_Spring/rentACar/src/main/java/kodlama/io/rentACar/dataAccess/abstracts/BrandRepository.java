package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;



import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository {
//	arrayt degıl colleksiyon halıne getırdık-- array Brand[] seklınde  oluyor
	List<Brand> getall();
	
	
	
}
