
public class CustomerManager {
	//işkodları yazılır
	private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        // iş kodları
        customerDal.add();
    
	}
}
