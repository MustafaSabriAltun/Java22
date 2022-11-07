package kodlama.io.rentACar.business.responses;
//data alıyorsan request -- data veriyorsan response

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {

		 private int id;
		 private String name;
}
