package homework;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("deneme@gmail.com");
		user1.setPassword("sifre");
		user1.setCourse("Java Kursu");
				
		User user2 = new User();
		user2.setId(2);
		user2.setEmail("deneme2@gmail.com");
		user2.setPassword("sifre");
		user2.setCourse(" C# Kursu");
		
		UserManager userManager1 = new UserManager();
		userManager1.userAdd(user1);
		
		UserManager userManager2 = new UserManager();
		userManager2.userAdd(user2);
		
	
		Student student1 = new Student();
		student1.setFirstName("Mustafa");
		student1.setLastName("IŞIK");
		student1.setEmail("isik@gmail.com");
		student1.setPassword("sifre");
		student1.setId(1);
		student1.setCourse("Java kursu");
		student1.setComplation("%48");
			
		Student student2 = new Student();
		student2.setFirstName("Ömer Faruk");
		student2.setLastName("ÇELENK");
		student2.setEmail("siltri@gmail.com");
		student2.setPassword("sifre");
		student2.setId(2);
		student2.setCourse(" C++ kursu");
		student2.setComplation("%78");
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.studentCreate(student1);
		studentManager1.studentProgress(student1);
		
		StudentManager studentManager2 = new StudentManager();
		studentManager2.studentCreate(student2);
		studentManager2.studentProgress(student2);

		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setCourse("Java Kursu");
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Engin");
		instructor2.setLastName("Demiroğ");
		instructor2.setCourse(" C++ Kursu");
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.InstructorCreate(instructor1);	
			
		InstructorManager instructorManager2 = new InstructorManager();
		instructorManager2.InstructorCreate(instructor2);	
	}

}
