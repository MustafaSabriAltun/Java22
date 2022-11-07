package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	
	//request-- rica etmek istemek manasındadır. kullanıcının bızden ıstedıgı anlamında kullanacagız
	// response-- rica karsısında verılen yanıttır. zaten kelime manası gayet açık **tepki**.
	
	
	void add (CreateBrandRequest createBrandRequest);
}
