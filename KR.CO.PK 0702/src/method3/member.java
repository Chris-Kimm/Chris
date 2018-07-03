package method3;

public class member {
	private String email;
	private String password;
	private String nickname;
	private int age;
	private String setEmail;
	private String setPassword;
	
	
public void display() {
		System.out.println("이메일:" + email + "\t"
		+ "비밀번호:" + password + "\t"
				+ "닉네임:" + nickname + "\t"
				+ "나이" + age);
}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
