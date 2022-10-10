//interfaceler-- 
//Dal -- Date access layer -- onceden manager olarak kullandıgımız.
public class Main {

	public static void main(String[] args) {
		 ICustomerDal customerDal= new OracleCustomerDal();
		 customerDal.add();
	}

}
