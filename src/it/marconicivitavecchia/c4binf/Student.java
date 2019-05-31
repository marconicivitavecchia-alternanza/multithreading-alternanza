package it.marconicivitavecchia.c4binf;

public class Student implements Runnable {
	private HourManager hm;

	public Student(HourManager hm) {
		super();
		this.hm = hm;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			String teacher = hm.get();
		}

	}

}
