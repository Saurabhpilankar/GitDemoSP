package inheritance;

public class CarMachine extends Machines{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
public void wipeWindshield() {
	System.out.println("wipe windShield");
}

public void getInfo() {
	System.out.println("machine : "+name);
	
}

}
