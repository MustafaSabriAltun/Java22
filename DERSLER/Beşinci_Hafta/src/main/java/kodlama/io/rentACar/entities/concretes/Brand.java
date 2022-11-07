package kodlama.io.rentACar.entities.concretes;
import javax.persistence.Column;
// Kullanılmayan importlar CTRL+SHİFT+O kısa yoluyla onları uçmağa götürür.
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Persistance-- denilince veriyi bir yere kaydetmek orada saklamak gıbı bır anlam olussun aklında
//veri tabanındakı hangı tabloya karsılık gelecegını yazmıs olduk
@Table(name="brands")
//@Data ile Getter ve Setterlar olustu
@Data 
//@AllArgsConstructor -- ile adı ustunde  paramtrelı conslar
@AllArgsConstructor
//@NoArgsConstructor -- ile ise parametresız olanlar
@NoArgsConstructor
//@Entity ile sen bı entıtısın bılader diyoruz.
@Entity
public class Brand {
	// @Column(name="id") --  tablonun ıcerısındeki kolonları eslestırıyoruz.
	// @Id----sen veri tabanında Primary key aalanısın
		// @GeneratedValue(strategy = GenerationType.IDENTITY)  sureklı kendılıgınden artması ıcın yaparız
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	
	
}
