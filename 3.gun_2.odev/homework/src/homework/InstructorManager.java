package homework;

public class InstructorManager {
	public void InstructorCreate(Instructor instructor) {
		System.out.println("E�itmen �smi : " + instructor.getFirstName() + "   Soyismi : " + instructor.getLastName() + "    E�itmen olarak verece�i kurs : " + instructor.getCourse() );
	}
}
