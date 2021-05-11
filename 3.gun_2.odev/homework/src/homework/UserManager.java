package homework;

public class UserManager {
	public void userAdd(User user) {
		System.out.println("Yeni Kullanýcý : "+"User id :" + user.getId() + "   E-mail : " + user.getEmail() + "   Password : " + user.getPassword() + "   Ýlgilendiði kurs : " + user.getCourse());
	}
}
