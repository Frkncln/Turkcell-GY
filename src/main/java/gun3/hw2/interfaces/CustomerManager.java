package gun3.hw2.interfaces;

public class CustomerManager {
		ICustomerDal customerDal;
		public CustomerManager(ICustomerDal customerDal) {
			this.customerDal = customerDal;
		}
	public void add() {
	
		customerDal.add();
	}
	
}
