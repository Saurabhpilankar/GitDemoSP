package inheritance;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machines machine1 = new Machines();
		CarMachine car1 = new CarMachine();
		machine1.start();
		machine1.stop();
		
		car1.start();
		car1.stop();
		car1.wipeWindshield();
		car1.getInfo();
	}

}
