package it.marconicivitavecchia.c4binf;

public class HourManager {
	private int ore;
	private String teacher;
	public synchronized void put(String teacher){
		this.teacher=teacher;
		
		ore++;
		print("put");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized String get(){
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ore--;
		print("get");
		notify();
		return teacher;
	}
	public synchronized void print(String msg){
		System.out.println(msg+": le ore sono: "+ore);
	}
}
