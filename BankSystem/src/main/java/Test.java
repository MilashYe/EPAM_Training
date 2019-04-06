import model.service.encryption.JBCrypt;
import model.service.encryption.PasswordService;

public class Test {
	public static void main(String[] args) {
		String pwd = "admin";
		String pwd1 = "user";

		PasswordService pwdService = new JBCrypt();

		System.out.println(pwdService.createHash("user"));

		System.out.println(pwdService.checkPwd("admin", pwdService.createHash(pwd)));


	}
}
