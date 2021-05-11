package homework;

public class StudentManager {
	public void studentCreate(Student student) {
		System.out.println("Yeni Öğrenci   : " + "İsim : " + student.getFirstName() + "    Soyisim : " + student.getLastName() + "    Kayıt olduğu kurs : " + student.getCourse());
	}
	
	public void studentProgress(Student student) {
		System.out.println(student.getFirstName() + " Öğrencisinin İlerleme Durumu : " + student.getComplation());
	}
	
}
