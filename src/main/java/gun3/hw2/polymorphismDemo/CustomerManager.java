	package gun3.hw2.polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger= logger; 
	}
     public void add() {
    	 System.out.println("Müşteri eklendi");
    	 this.logger.log("Log messsage");
     }


}
