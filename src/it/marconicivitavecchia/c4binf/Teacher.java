package it.marconicivitavecchia.c4binf;

public class Teacher implements Runnable{
	private HourManager hm;
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			hm.put("tuba"+i);
		}
		
	}
	public Teacher(HourManager hm) {
		super();
		this.hm = hm;
	}
	
}
