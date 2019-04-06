package model.service.encryption;

public class PasswordAuthentification implements PasswordService {


	@Override
	public String createHash(String pwd) {
		String hash = "";
		char[] hashChar = pwd.toCharArray();
		int[] res = new int[hashChar.length];
		for ( int i = 0; i < hashChar.length; i++ ) {
			hashChar[i] ^= i;
			res[i] = hashChar[i];
			hash += res[i];

		}
		return hash;
	}
	@Override
	public boolean checkPwd(String pwd, String dbHash) {

		return this.createHash(pwd).equals(dbHash);
	}

}
