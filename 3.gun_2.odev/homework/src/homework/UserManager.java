package homework;

public class UserManager {
	public void userAdd(User user) {
		System.out.println("Yeni Kullanıcı : "+"User id :" + user.getId() + "   E-mail : " + user.getEmail() + "   Password : " + user.getPassword() + "   İlgilendiği kurs : " + user.getCourse());
	}
}
