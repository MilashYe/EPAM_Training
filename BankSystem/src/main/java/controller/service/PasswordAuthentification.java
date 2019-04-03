package controller.service;

public class PasswordAuthentification {

	private static String hash = "";


	public static void createHash(String pwd) {
		char[] hashChar = pwd.toCharArray();
		int[] res = new int[hashChar.length];
		for ( int i = 0; i < hashChar.length; i++ ) {
			hashChar[i] ^= i;
			res[i] = hashChar[i];
			hash += res[i];

		}
	}

	public static boolean checkPwd(String pwd, String dbHash) {
		hash = "";
		createHash(pwd);
		return hash.equals(dbHash);
	}

	public static String getHash() {
		return hash;
	}
}
