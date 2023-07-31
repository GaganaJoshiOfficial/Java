
public class TrainerApp {
 
	public static void main(String[] args)
	{
		Trainer t1 = new Trainer ();
		t1.id = 1234;
		t1.name = "Arun";
		t1.subject = "java";
		System.out.println("Id = " + t1.id + ", Name = " + t1.name + ", Subject = " + t1.subject);
		t1.teach();
		t1.takeAttendence();
		
		Trainer t2 = new Trainer ();
		t1.id = 4321;
		t1.name = "Sandesh";
		t1.subject = "testing";
		System.out.println("Id = " + t2.id + ", Name = " + t2.name + ", Subject = " + t2.subject);
		t2.teach();
		t2.takeAttendence();
		
		
	}
}
