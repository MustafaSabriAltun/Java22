package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
@Service// bu sınıf bir bussiness nesnesıdır.
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}



	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
			
		}
		
		// iş kuralları
		return brandsResponse;
		// Mapping yokken yazılmaıs gereken kod ustte bulunuyor. aslnda asagıda bahsedılen durumu en basıt sekılde cozebılmek ıcın 
		//bos lıste olusturulup oraya yazdırdık vs.
		
		/*
		 * onca değişikliğin ardından tabi ki buradakı kod patladı sebebi bizim artık
		 * bütün verileriimizi müşteriye göstermek istemeyişimiz son durum şu şekilde
		 * Brand -- id,name,kalite,sayı,dokuivs GetAllResponce-- id,name
		 * 
		 * bizim vermek ıstedıgımız cevap kolonları aslında aynı bılgıler sadece hepsını
		 * vermek ıstemıyoruz. yanı bız vermek ıstedıgımız verılerı bırbırıne esıtlersek
		 * sadece ıstedıklerımızı onların karsısına cıkartmıs olabılırız. bu duruma
		 * MAPPİNG deniyor. yanı aslında aradıgın seyın nerede oldugunu gosterıyor aynı
		 * harıta gıbı en azından suan ben boyle anladım
		 */


	}



	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand ();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}

}
