package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//data alıyorsan request -- data veriyorsan response
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
// bizden istendiğinde son kullanıcıya  markaların ıd lerını gostermek zorunda degılız gostersek gereksız olur zaten. o sebeple sadece name yazdık
	private String name;

}
