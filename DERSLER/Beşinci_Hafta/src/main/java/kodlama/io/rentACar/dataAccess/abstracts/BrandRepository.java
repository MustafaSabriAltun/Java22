package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;
// interface' e bir interface implemente edilmez. extends edılır çünkü ikiside soyut zaten içlerini dolduracak bir durum yok

//JpaRepository<Brand, Integer> -- <bu kısma entity i  ,  ıkıncı kısma ıse orada bulunan primary key in type ını gırın  >
public interface BrandRepository extends JpaRepository<Brand, Integer> {
	//ınmemory kısmını sıldık neden? ve nasıl ? ıkısının cevabı aynı. somut u olmayan bı seyın soyut halını nasıl yaparsın mantıksız 
	//diye bılırsın lakin JpaRepostory anlık olarak kendı bellegınde classı olusturabılıyor boylelıkle bızı  buyuk zahmetten kurtara bılıyor
}
