package Kodlama.io.Kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "ProgrammingLanguage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "programmingLanugageId")
	private int id;

	@Column(name = "programmingLanguageName")
	@NotNull(message = "Bu alan boş bırakılamaz.")
	private String name;
	
	
	@OneToMany(mappedBy="programmingLanguage",  fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<ProgrammingTechnology> programmingTechnologies;
	// bir dili birden fazla teknolojıyle ılıskılendırecegımızden one to many
	

}
