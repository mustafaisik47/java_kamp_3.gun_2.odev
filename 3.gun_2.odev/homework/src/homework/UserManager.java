package homework;

public class UserManager {
	public void userAdd(User user) {
		System.out.println("Yeni Kullan�c� : "+"User id :" + user.getId() + "   E-mail : " + user.getEmail() + "   Password : " + user.getPassword() + "   �lgilendi�i kurs : " + user.getCourse());
	}
}
