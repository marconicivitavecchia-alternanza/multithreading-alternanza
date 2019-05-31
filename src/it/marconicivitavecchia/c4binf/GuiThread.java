package it.marconicivitavecchia.c4binf;
public class GuiThread {

	public static void main(String[] args) {
		HourManager manager = new HourManager();
		Thread teacher = new Thread(new Teacher(manager) ,"teacher thread" );
		Thread student = new Thread(new Student(manager) , "student thread");
		teacher.start();
		student.start();
		
	}
}
