package homework;

public class StudentManager {
	public void studentCreate(Student student) {
		System.out.println("Yeni ��renci   : " + "�sim : " + student.getFirstName() + "    Soyisim : " + student.getLastName() + "    Kay�t oldu�u kurs : " + student.getCourse());
	}
	
	public void studentProgress(Student student) {
		System.out.println(student.getFirstName() + " ��rencisinin �lerleme Durumu : " + student.getComplation());
	}
	
}
