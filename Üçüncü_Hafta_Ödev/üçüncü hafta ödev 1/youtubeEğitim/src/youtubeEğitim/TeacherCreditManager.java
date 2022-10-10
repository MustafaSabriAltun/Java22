package youtubeEğitim;
//java da implements diye yaptıgımız interface kullanımını C# da :  ile yapıyorduk. haberin olsun lazım olur aslanım.
public class TeacherCreditManager extends BaseCreditManager  implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
